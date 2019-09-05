package LeetCode.Medium;

//You are given two non-empty linked lists representing two non-negative integers.
//The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

import LeetCode.LeetCodeUtil;

import java.util.LinkedList;

public class AddTwoNumbers {

    public static LinkedList<Integer> AddTwoNumbers(LinkedList<Integer> first, LinkedList<Integer> second) {
        LinkedList<Integer> result = new LinkedList<>();
        Integer carryOver = 0;
        Integer columnSum;
        while (!first.isEmpty() || !second.isEmpty()) {
            columnSum = 0;
            if (!first.isEmpty()) {
                columnSum += first.removeFirst();
            }
            if (!second.isEmpty()) {
                columnSum += second.removeFirst();
            }
            carryOver = (columnSum + carryOver) / 10;
            result.addFirst(columnSum % 10);
        }
        return result;
    }


    public static void Print(LinkedList<Integer> first, LinkedList<Integer> second){
        LinkedList<Integer> solution = AddTwoNumbers(first, second);
        System.out.println("Input: " + LeetCodeUtil.linkedListToString(first) + " + " +
                LeetCodeUtil.linkedListToString(second) +
                "\n Output : " + LeetCodeUtil.linkedListToString(solution) +
                "\n Explaination: " + LeetCodeUtil.linkedListConcatValueString(LeetCodeUtil.reverseLinkedList(first)) + " + " +
                LeetCodeUtil.linkedListConcatValueString(LeetCodeUtil.reverseLinkedList(second)) + " = " +
                LeetCodeUtil.linkedListConcatValueString(LeetCodeUtil.reverseLinkedList(solution)));
    }
}
