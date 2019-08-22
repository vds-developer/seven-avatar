package LeetCode.Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String LogestCommonPrefix (String[] input) {
        if (input.length ==0 ) return "";
        char[] matchLetter = input[0].toCharArray();
        for (String word : input){
            char[] letters = word.toCharArray();
            for(int i = 0 ; i < letters.length || i < matchLetter.length ; i ++) {
                if (letters[i] != matchLetter[i]) matchLetter = Arrays.copyOfRange(matchLetter, 0, i);
            }
        }
        return matchLetter.toString();
    }

    public static String longestCommonPrefixTextBook (String[] input) {
        if (input.length == 0 ) return "";
        String matchString = input[0];
        for (String word : input) {
            if (word.indexOf(matchString) != 0 ) {
                matchString = matchString.substring(0, matchString.length() - 1);
            }
        }
        return matchString;
    }
}
