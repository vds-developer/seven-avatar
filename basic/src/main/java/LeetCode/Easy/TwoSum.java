package LeetCode.Easy;

import LeetCode.LeetCodeUtil;

import java.util.HashMap;

//
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//

public class TwoSum {
    public static int[] TwoSum (int[] input, int sum) {
        int[] solution = new int[2];
        //Assuming that each input has one solution so the input array needs to be greater than 0
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int indice = 0; indice < input.length ; indice ++) {
            hashMap.put(input[indice], indice);
        }
        for (int i = 0 ; i < input.length ; i++) {
            if (hashMap.get(sum - input[i]) != null) {
                solution[0] = i;
                solution[1] = hashMap.get(sum - input[i]);
                break;
            }
        }
        return solution;
    }

    public static int[] TwoSumOnePass (int[] input, int sum) {
        int[] solution = new int[2];
        //Assuming that each input has one solution so the input array needs to be greater than 0
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int indice = 0; indice < input.length ; indice ++) {
            if (hashMap.get(sum - input[indice]) != null) {
                solution[0] = indice;
                solution[1] = hashMap.get(sum - input[indice]);
                break;
            }
            hashMap.put(input[indice], indice);
        }
        return solution;
    }

    public static void Print(int[] input, int sum){
        int[] solution = TwoSum(input, sum);
        System.out.println("Given nums = [" + LeetCodeUtil.ArrayToCommaSeperatedString(input) + " ]," +
                "Target: " + sum + "\nBecause nums[" + solution[0] + "]" + " nums[" +
                solution[1] + "] = " + input[solution[0]] + " + " + input[solution[1]] + " = " + sum +
                "return [" + solution[0] + ", " + solution[1] + "].");
    }
}
