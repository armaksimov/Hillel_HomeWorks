package com.hillel.databases.resources;

public class resources {
    private final String URL = "jdbc:mysql://localhost:3306/videobase?useUnicode=true&serverTimezone=UTC&useSSL=false";
    private final String USERNAME = "root";
    private final String PASSWORD = "admin";

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getURL() {
        return URL;
    }

    public String getUSERNAME() {
        return USERNAME;
    }
}
