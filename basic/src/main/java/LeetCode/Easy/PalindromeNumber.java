package LeetCode.Easy;

public class PalindromeNumber {
    public static Boolean PalindromeNumber(int number) {
        if (number < 0 || number % 10 == 0 && number != 0) return false;
        int reverse = number % 10;
        while (number > reverse) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse == number || number == reverse / 10;
    }

    public static void print (int input) {
        System.out.println("Input: " + input + "\nOutput: " + PalindromeNumber(input));
    }
}
