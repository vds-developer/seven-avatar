package src.main.java.LeetCode.Medium;

//
//        Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//        Each element in the array represents your maximum jump length at that position.
//
//        Determine if you are able to reach the last index.

import java.util.Arrays;
import java.util.LinkedList;

public class JumpGame {
    //greedy
    public static Integer[] JumpGame(int[] input) {
        int current = 0;
        int next = 0;
        LinkedList<Integer> steps = new LinkedList<>();
        steps.add(0);
        while (current + input[current] < input.length) {
            if (input[current] == 0) return null;
            for (int i = current; i < (current + input[current]); i++) {
                //cover case if input[i] = 0
                if (i + input[i] > next) next = i;
            }
            current = next;
            steps.add(current);
        }
        return steps.toArray(new Integer[0]);

    }
}
