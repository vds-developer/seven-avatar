package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCodeUtil {
    public static String ArrayToCommaSeperatedString(int[] intArray) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(intArray).forEach(x -> builder.append(x).append(", "));
        return builder.toString().substring(0, builder.toString().lastIndexOf(',')).trim();
    }

    public static String linkedListToString(LinkedList<Integer> array) {
        StringBuilder builder = new StringBuilder();
        array.forEach(x -> builder.append(x).append(" -> "));
        return builder.toString().substring(0, builder.toString().lastIndexOf("->")).trim();
    }

    public static LinkedList reverseLinkedList (LinkedList linkedList) {
        LinkedList rLinkedList = new LinkedList();
        linkedList.forEach(x -> rLinkedList.add(x));
        return rLinkedList;
    }
    
    public static String linkedListConcatValueString(LinkedList linkedList) {
        StringBuilder builder = new StringBuilder();
        linkedList.forEach(x -> builder.append(x));
        return builder.toString();
    }
}
