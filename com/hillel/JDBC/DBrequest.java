package com.hillel.databases;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import com.hillel.databases.humans.*;
import com.hillel.databases.films.*;
import com.hillel.databases.connections.*;
import java.sql.*;

public class DBrequest {
    ConnectionLib connectionLib = new ConnectionLib();
    Statement statement = connectionLib.getStatement();

    private List<filmDirector> filmDirectorList = new ArrayList<filmDirector>();
    private List<Actor> actorList = new ArrayList<Actor>();
    private List<Films> films = new ArrayList<Films>();

    public List<Films> getFilmsAndActors() throws ParseException {
        Films film = new Films();
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM videobase.films");
//            if(resultSet.next()){
                while (resultSet.next()){
                    film.setId(resultSet.getInt("id"));
                    film.setName(resultSet.getString("film_name"));
                    ResultSet rs = statement.executeQuery("SELECT * FROM videobase.relations_film_actor RIGHT JOIN " + "videobase.actors ON relations_film_actor.actor_id = actors.id WHERE film_id = " + film.getId() + ";");
                    List<Actor> actors = new ArrayList<Actor>();
                    while (rs.next()) {
                        actors.add(new Actor(rs.getInt("id"), rs.getString("fullname"), rs.getDate("birthdate")));
                    }
                    film.setActors(actors);
                    film.setFilmDirectors(new filmDirector(0, resultSet.getString("filmdirector"), null));
                    film.setReleaseDate(resultSet.getDate("releasedate"));
                    film.setOriginCountry(resultSet.getString("origin"));
                    films.add(film);
                    film = null;
                }

        } catch (SQLException e){
            System.out.println("Error while writing \"Films\" section");
            e.printStackTrace();
        }
        return films;
    }

    public List<Films> getFilmsByYear(Integer year) throws ParseException, SQLException {
        List<Films> newFilms = new ArrayList<Films>();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM videobase.films WHERE films.releasedate >= 01-01-" + year + ";");
        while (resultSet.next()){
            Films film = new Films();
            film.setId(resultSet.getInt("id"));
            film.setName(resultSet.getString("film_name"));
            ResultSet rs = statement.executeQuery("SELECT * FROM videobase.relations_film_actor RIGHT JOIN " + "videobase.actors ON relations_film_actor.actor_id = actors.id WHERE film_id = " + film.getId() + ";");
            List<Actor> actors = new ArrayList<Actor>();
            while (rs.next()) {
                actors.add(new Actor(rs.getInt("id"), rs.getString("fullname"), rs.getDate("birthdate")));
            }
            film.setActors(actors);
            film.setFilmDirectors(new filmDirector(0, resultSet.getString("filmdirector"), null));
            film.setReleaseDate(resultSet.getDate("releasedate"));
            film.setOriginCountry(resultSet.getString("origin"));
            newFilms.add(film);
            film = null;
        }

        return newFilms;
    }

    public List<Actor> actorsFilmDir() throws SQLException {
        List actor_FilmDir = new ArrayList<Actor>();
        ResultSet rs = statement.executeQuery("SELECT * FROM videobase.actors WHERE actors.fullname = director.fullname");
        while(rs.next()){
            actorList.add(new Actor(rs.getInt("id"), rs.getString("fullname"), rs.getDate("birthdate")));
        }
        return actor_FilmDir;
    }

    public List<Actor> getActors() {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM videobase.actors");
            while(rs.next()){
                actorList.add(new Actor(rs.getInt(1), rs.getString(2), rs.getDate(3, null)));
            }
        } catch (SQLException e) {
            System.out.println("Error while writing \"Actors\" section");
        }
        return actorList;
    }

    public List<filmDirector> getFilmDirectorList() {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM videobase.director");
            while(rs.next()){
                filmDirectorList.add(new filmDirector(rs.getInt(1), rs.getString(2), rs.getDate(3, null)));
            }
            System.out.println(filmDirectorList);
        } catch (SQLException e) {
            System.out.println("Error while writing \"Directors\" section");
        }
        return filmDirectorList;
    }
}
