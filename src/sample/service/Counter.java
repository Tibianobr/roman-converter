package sample.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Counter {

    private final static List<String> romanLetters = new ArrayList<>();

    static {
        romanLetters.add("I");
        romanLetters.add("V");
        romanLetters.add("X");
        romanLetters.add("L");
        romanLetters.add("C");
        romanLetters.add("D");
        romanLetters.add("M");
    }


    public static HashMap<String,Integer> countOccurrences(String romanNumber)
    {
        HashMap<String, Integer> stats = new HashMap<>();
        for (String letter : romanLetters) {
            int count = romanNumber.length() - romanNumber.replace(letter, "").length();
            stats.put(letter,count);
        }
        return stats;
    }
}
