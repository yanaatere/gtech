package com.test.gtech.logic;

public class ReverseWord {

    private static String reverseString(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            StringBuilder characterSb = new StringBuilder();
            char[] chars = word.toCharArray();
            for (int i = chars.length - 1; i >= 0;  i--) {
                characterSb.append(chars[i]);
            }
            sb.append(characterSb.toString().toLowerCase()).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String reverseName = reverseString("Nama saya John Doe");
        System.out.println(reverseName);
    }
}
