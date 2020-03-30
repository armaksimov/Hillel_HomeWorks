package com.hillel.databases.humans;

import com.hillel.databases.films.*;

import java.sql.Date;
import java.util.List;

public class Actor extends Individual {
    private List<Films> filmsList;
    public Actor(int id, String name, Date bd) {
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
