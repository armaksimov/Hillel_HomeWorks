package com.hillel.HWs.webApp;

import java.io.*;
import java.sql.Connection;
import java.util.*;

public class Utils {
    public String sort(String nums) {
        String[] n = nums.split(", ");
        int[] ints = new int[n.length];
        for (int i = 0; i < n.length; i++)
            ints[i] = Integer.parseInt(n[i]);
        return bubbleSort(ints).toString();
    }

    public String wordFinder(String word) throws IOException {
        String[] words = readFile().split("\\s+");
        String wordWPosition = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)){
                wordWPosition = word + ++i;
                break;
            }
        }
        if (wordWPosition.isEmpty()) return "No such word found";
        return wordWPosition;
    }

    public String readFile() throws IOException {
        File file = new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 8.5\\webapps\\firstApp\\data.txt");
        String container = "";
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            container += scanner.next();
        }
        return container;
    }

    private int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
}
