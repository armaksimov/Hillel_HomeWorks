package com.hillel.databases;

import java.sql.SQLException;
import java.text.ParseException;

public class Runner {
    public static void main(String[] args) throws ParseException, SQLException {
        filmLib lib = new filmLib();
        System.out.println(lib.getNewFilms());
        System.out.println(lib.actor_filmdirector());
        System.out.println(lib.getOldFilms(2002));
        System.out.println(lib.actorsFilmedInMoreFilms(3));
    }
}
