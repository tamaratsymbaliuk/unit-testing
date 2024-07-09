package com.neutrinosvs.exercieses;

public class Ex1 {

    public static String everyOtherUpperCase(String word) {
        StringBuilder sb = new StringBuilder(word.length()); // Place to store new string as we build it one character at a time
        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1);
            if (i % 2 == 0) { // when even
                sb.append(letter);
            } else {
                 sb.append(letter.toUpperCase());
            }
        }
        return sb.toString(); //  convert StringBuilder back into our new String
    }

}
