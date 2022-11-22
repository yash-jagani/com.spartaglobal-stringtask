package org.spartaglobal.stringtask;

public class Main {
    public static void main(String[] args) {
        String[] words = {"The", "cat", "in", "the", "hat"};
        char input = 't';
        String phrase = "The cat in the hat";

        System.out.println(CountWordsFromListAndString.countWords(words, input));

        System.out.println(CountWordsFromListAndString.countWordsInString(phrase, input));
    }
}