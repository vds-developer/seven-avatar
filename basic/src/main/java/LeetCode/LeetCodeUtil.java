package LeetCode;

import java.util.Arrays;

public class LeetCodeUtil {
    public static String ArrayToString (int[] intArray) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(intArray).forEach(x -> builder.append(x).append(", "));
        return builder.toString().substring(0, builder.toString().lastIndexOf(',')).trim();
    }
}
