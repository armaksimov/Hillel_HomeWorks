package com.hillel.HWs.reversedPolishNotation;

import java.util.Stack;

public class Reverser {
    public static String toPolishNotation(String equation) {
        Stack<String> stack = new Stack();
        String eqElements[] = equation.split(" ");
        int numOfOperators = (eqElements.length - 1) / 2;
        String operators[] = new String[numOfOperators];
        Integer operands[] = new Integer[numOfOperators + 1];
        int c = 0;
        int oC = 0;
        for (int i = 0; i < eqElements.length; i++) {
            if(eqElements[i].equals("/") || eqElements[i].equals("*") || eqElements[i].equals("+") || eqElements[i].equals("-")){
                operators[c] = eqElements[i];
                c++;
            }
            else{
                operands[oC] = Integer.parseInt(eqElements[i]);
                oC++;
            }
        }
        // pushing first operand
        stack.push(operands[0].toString());
        int res = operands[0];
        int innerC = 1;
        for (int i = 0; i < numOfOperators; i++) {
            stack.push(operands[innerC].toString());
            innerC++;
            System.out.print(stack);
            switch (operators[i]){
                case ("+"):{
                    res += Integer.parseInt(stack.peek());
                    stack.push("+");
                    break;
                }
                case ("-"):{
                    res -= Integer.parseInt(stack.peek());
                    stack.push("-");
                    break;
                }
                case ("/"):{
                    res /=  Integer.parseInt(stack.peek());
                    stack.push("/");
                    break;
                }
                case ("*"):{
                    res *= Integer.parseInt(stack.peek());
                    stack.push("*");
                    break;
                }
            }
        }

        Object reversed[] = stack.toArray();

//        for polish notation
//        for (int i = reversed.length - 1; i >= 0; i--) {
//           System.out.print(reversed[i] + " ");
//        }

        String newEq = "";
        for (int i = 0; i < reversed.length; i++) {
            newEq += reversed[i] + " ";
        }
        newEq += "= " + res;
        return newEq;
    }

}
