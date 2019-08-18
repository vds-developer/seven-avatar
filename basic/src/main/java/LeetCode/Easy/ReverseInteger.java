package LeetCode.Easy;



//Given a 32-bit signed integer, reverse digits of an integer.
public class ReverseInteger {
    public static int ReverseInteger (int input) {
        String solution = "";

        int startModular = 10;
        while (input != input % startModular) {
            solution = Integer.toString(input % startModular) + solution;
        }
        return Integer.getInteger(solution);
    }

    public static void print(int input) {
        System.out.println("Input: " + input + "\nOutput: " + ReverseInteger(input));
    }
}
