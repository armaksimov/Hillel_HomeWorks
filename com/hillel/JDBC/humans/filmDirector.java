package com.hillel.databases.humans;

import com.hillel.databases.films.Films;

import java.sql.Date;
import java.util.List;

public class filmDirector extends Individual {
    private List<Films> filmsList;
    public filmDirector(int id, String name, Date bd) {
        super(id, name, bd);
    }

    public void setFilmsList(List<Films> filmsList) {
        this.filmsList = filmsList;
    }

    public void addToFilmsList(Films film) { this.filmsList.add(film); }

    public List<Films> getFilmsList() {
        return filmsList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
