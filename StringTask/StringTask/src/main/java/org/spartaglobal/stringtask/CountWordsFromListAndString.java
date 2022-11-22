package org.spartaglobal.stringtask;

public class CountWordsFromListAndString {

    public static int countWords(String[] words, char x){
          int count = 0;
          for (String word: words){
              if(word.toLowerCase().charAt(0) == x){
                  count++;
              }
          }
          return count;
    }

    public static int countWordsInString(String phrase, char x){
        String[] phraseToList = phrase.split(" ");
        return countWords(phraseToList, x);
    }
}
