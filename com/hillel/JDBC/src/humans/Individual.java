package com.hillel.databases.humans;

import java.sql.Date;

public class Individual {
    private int id;
    private String name;
    private Date dateOfBirth;

    public Individual(int id, String name, Date bd){
        this.id = id;
        this.name = name;
        this.dateOfBirth = bd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return id + " name: " + this.name + " date of birth: " + dateOfBirth + "; \n ";
    }
}
