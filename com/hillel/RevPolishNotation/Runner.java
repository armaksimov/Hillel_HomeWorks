package com.hillel.HWs.reversedPolishNotation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter an arithmetic equation to convert to RPN and solve: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String equation = reader.readLine();
//        Reverser.toPolishNotation(equation);
        System.out.print(Reverser.toPolishNotation(equation));
    }
}
