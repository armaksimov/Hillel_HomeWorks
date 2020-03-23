package com.hillel.databases;

import com.hillel.databases.connections.*;
import com.hillel.databases.films.Films;
import com.hillel.databases.humans.Actor;
import com.hillel.databases.humans.filmDirector;

import java.sql.Statement;
import java.text.ParseException;
import java.util.*;

public class filmLib {
    DBrequest req = new DBrequest();


    public List<Films> getNewFilms(Integer currentYear) throws ParseException {
        List<Films> films = req.getFilmsAndActors();
        List<Films> newFilms = new ArrayList<Films>();
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getReleaseDate().getYear() == currentYear - 1 || films.get(i).getReleaseDate().getYear() == currentYear) {
                newFilms.add(films.get(i));
            }
        }
        return newFilms;
    }

    public List<Actor> infoOnActors(Films film) {
        return film.getActors();
    }

    public List<Actor> actorsFilmedInMoreFilms(Integer n) {
        List<Actor> bigActor = new ArrayList<Actor>();
        List<Actor> actors = req.getActors();
        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getFilmsList().size() >= n) {
                bigActor.add(actors.get(i));
            }
        }
        return bigActor;
    }

    public List<Actor> actor_filmdirector(){
        List<Actor> actorFilmDirector = new ArrayList<Actor>();
        List<Actor> actors = req.getActors();
        List<filmDirector> directors = req.getFilmDirectorList();
        for (int i = 0; i < actors.size(); i++)
            for (int j = 0; j < directors.size(); j++) {
                if(actors.get(i).getName().equals(directors.get(j).getName())){
                    actorFilmDirector.add(actors.get(i));
                }
            }
        return actorFilmDirector;
    }

    public List<Films> getOldFilms(Integer neededYear) throws ParseException {
        List<Films> films = req.getFilmsAndActors();
        List<Films> oldFilms = new ArrayList<Films>();
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getReleaseDate().getYear() <= neededYear) {
                oldFilms.add(films.get(i));
            }
        }
        return oldFilms;
    }
}
