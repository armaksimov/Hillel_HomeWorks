package com.hillel.databases;

import java.text.ParseException;

public class Runner {
    public static void main(String[] args) throws ParseException {
        filmLib lib = new filmLib();
        System.out.println(lib.getNewFilms(2020));
    }
}
