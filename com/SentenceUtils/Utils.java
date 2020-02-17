package com.hillel.HWs.sentenseUtils;

import java.util.*;

public class Utils {

    public static String[] splitting(String sent){
        String[] sentenceByElements = sent.split("\\s+");
//        List<String> words = new ArrayList<>();
        for (int i = 0; i < sentenceByElements.length; i++) {
            sentenceByElements[i] = sentenceByElements[i].replaceAll("[^\\w]", "");
        }
        return sentenceByElements;
    }

    public static HashMap countRepititionTimes(String[] sent){
        HashMap<String, Integer> repCount = new HashMap();
        for(String thisWord : sent) {
            if (repCount.containsKey(thisWord)) {
                repCount.put(thisWord, repCount.get(thisWord) + 1);
            } else {
                repCount.put(thisWord, 1);
            }
        }
            return repCount;

        // other realization
//        String word = new String();
//        int counter = 0;
//        List wordRepCount = new ArrayList();
//        for (int i = 0; i < sent.length - 1; i++) {
//            for (int j = 0; j < sent.length - i - 1; j++) {
//                if (sent[i].equals(sent[j]))
//                    word = sent[i];
//                counter++;
//            }
//            wordRepCount.add(word + counter);
//        }
//        return wordRepCount;
    }

    public static String replaceByNumOfCharacter(int index, char replacer, String sent[]){
        List<String> sentence = new ArrayList<String>();
        for (String word : sent) {
            if (index >= word.length())
                sentence.add(word);
            else {
                String wordEl = new String();
                char letters[] = word.toCharArray();
                for (int i = 0; i < word.length(); i++) {
                    if(i != index) {
                        wordEl += letters[i];
                    }
                    else {
                        wordEl += replacer;
                    }
                }
            sentence.add(wordEl);
            }
        }
        return sentence.toString();
    }

    public static String  printAllWithRepeatedFirstAndLast(String sent[]){
        ArrayList<String> wordsRepeated = new ArrayList<String>();
        for (int i = 0; i < sent.length; i++)
            for (int j = 0; j <= sent.length - i - 1; j++) {
                char[] word1 = sent[i].toCharArray();
                char[] word2 = sent[j].toCharArray();
                if (word1[0] == (word2[0]) && word1[word1.length - 1] == word2[word2.length - 1]){
                    String word = new String();
                    for (int k = 0; k < word1.length; k++) {
                        word += word1[k];
                    }
                    wordsRepeated.add(word);
                }
                else {
                    continue;
                }
            }
        return wordsRepeated.toString();
    }

    public static int numOfPunctuationSigns(String sent){
        int counter = 0;
        char sentELs[] = sent.toCharArray();
        for (char a : sentELs) {
            if(a == ',' || a == '.' || a == '?' || a == ':' || a == ';' || a == '!' || a == '-'){
                counter++;
            }
        }
        return counter;
    }

}
