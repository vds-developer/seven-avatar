package LeetCode.Easy;

import LeetCode.generator.ArrayGenerator;

public class RotateInplaceArray {
	public static int[] RotateInplaceArray(int[] input, int k) {
		//for (int i = 0; i < input.length; i++) {
		//	int prevIndex = Math.abs((i - k) % input.length)
		//	input[prevIndex] =
		//}

		for (int i = 0; i < k; i++) {
			rotateonce(input);
		}
		return input;
	}

	private static int[] rotateonce(int[] input) {
		int tmp = input[input.length - 1];
		for (int i = 0; i < input.length; i++) {
			int tmp1 = input[i];
			input[i] = tmp;
			tmp = tmp1;


		}
		return input;
	}

	public static void main (String[]  args) {
		int[] input = ArrayGenerator.generateRandomIntArray(10);
		int k = 3;
		for (int i: input) {
			System.out.print(i + " ");
		}
		System.out.println();
		RotateInplaceArray(input, k);
		for (int i: input) {
			System.out.print(i + " ");
		}
	}
}
