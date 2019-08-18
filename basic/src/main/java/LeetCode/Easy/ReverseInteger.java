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

    public static int ReverseIntegerTextBook(int input) {
        long solution = 0;
        while (input != 0){
            solution = solution * 10 + input % 10;
            input /= 10;
        }

            if (solution < Integer.MIN_VALUE || solution > Integer.MAX_VALUE) {
                return 0;
            }else {
                return (int) solution;
            }
        }

    public static void print(int input) {
        System.out.println("Input: " + input + "\nOutput: " + ReverseInteger(input));
    }
}
