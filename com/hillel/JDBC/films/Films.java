package com.hillel.databases.films;

import com.hillel.databases.humans.*;

import java.util.*;

public class Films {
    private int id;
    private String name;
    private List<Actor> actors;
    private filmDirector filmDirectors;
    private Date releaseDate;
    private String originCountry;
    public Films(int id, String name, List<Actor> actors, filmDirector filmDirectors, Date releaseDate, String originCountry) {
        this.id = id;
        this.name = name;
        this.actors = actors;
        this.filmDirectors = filmDirectors;
        this.releaseDate = releaseDate;
        this.originCountry = originCountry;
    }

    public Films(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setFilmDirectors(filmDirector filmDirectors) {
        this.filmDirectors = filmDirectors;
    }

    public filmDirector getFilmDirectors() {
        return filmDirectors;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getOriginCountry() {
        return originCountry;
    }
}
