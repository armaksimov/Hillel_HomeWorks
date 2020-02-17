package com.hillel.HWs.sentenseUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();
        String splitted[] = Utils.splitting(sentence);


        HashMap reps = Utils.countRepititionTimes(splitted);
        System.out.println(reps);

        System.out.println(Utils.replaceByNumOfCharacter(1, 'a', splitted));

        System.out.println(Utils.printAllWithRepeatedFirstAndLast(splitted));

        System.out.println(Utils.numOfPunctuationSigns(sentence));
    }
}
