package com.neutrinosvs.exercieses;

public class Ex3 {

    public static StringBuilder spoonerism(String word1, String word2) {
        String first2 = word1.substring(0,2);
        String firstRest = word1.substring(2);
        String second2 = word2.substring(0,2);
        String secondRest = word2.substring(2);


        StringBuilder result = new StringBuilder("");
        result.append(second2);
        result.append(firstRest);
        result.append(" ");
        result.append(first2);
        result.append(secondRest);
        return result;

    }

    public static void main(String[] args) {
        System.out.println( Ex3.spoonerism("crushing", "blow"));
    }
}
