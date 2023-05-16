package com.codecool.isogram;

import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {
    private Set<Character> letters = new HashSet<>();

    public boolean isIsogram(String word) {
        for (int i = 0; i < word.length(); i++) {
            letters.add(word.toLowerCase().charAt(i));
        }
        return letters.size() == word.length();
    }
}