package org.example;

import java.lang.reflect.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public Boolean anagram(String word, String word2) {

        if(word == null || word2 == null || word.length() != word2.length()) {
            return false;
        }

        char[] chars = word.toLowerCase().toCharArray();
        char[] chars2 = word2.toLowerCase().toCharArray();

        boolean[] coincident = new boolean[chars.length];

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars[i] == chars2[j]) {
                    chars2[j] = ' ';
                    coincident[i] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < coincident.length; i++) {
            if (!coincident[i]) {
                return false;
            }
        }
        return true;
    }
}