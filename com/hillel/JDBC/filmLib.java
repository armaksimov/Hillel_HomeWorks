package com.hillel.databases;

import com.hillel.databases.connections.*;
import com.hillel.databases.films.Films;
import com.hillel.databases.humans.Actor;
import com.hillel.databases.humans.filmDirector;

import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.*;

public class filmLib {
    DBrequest req = new DBrequest();


    public List<Films> getNewFilms(int year) throws ParseException, SQLException {
        return req.getFilmsByYear(2020);
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

    public List<Actor> actor_filmdirector() throws SQLException {
        return req.actorsFilmDir();
    }

    public List<Films> getOldFilms(Integer neededYear) throws ParseException, SQLException {
        return req.getFilmsByYear(neededYear);
    }
}
