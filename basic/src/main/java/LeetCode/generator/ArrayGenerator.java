package LeetCode.generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayGenerator {
	static Random random = new Random();
	public static int[] generateRandomIntArray(int size){
		int [] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt(size * 10);
		}
		return array;
	}

	public static int[] GenerateDistinctRandomIntArray(int size) {
		int[] array = new int[size*3];
		int range = size*3/2;
		for (int i = 0; i < size*3; i++) {
			array[i] =  i - range;
		}
		ArrayGenerator.shuffleArray(array);
		return Arrays.copyOf(array, size);

	}

	public static int[] GenerateSortedIntArray(int size) {
		int[] array = generateRandomIntArray(size);
		Arrays.sort(array);
		return array;
	}

	public static int[] GenerateSortedRotatedIntArray(int size) {
		int[] sortedArray = GenerateSortedIntArray(size);
		return rotateIntArray(sortedArray, random.nextInt(sortedArray.length));

	}

	static int[] rotateIntArray(int[] array, int rotate) {
		for (int i = 0; i < rotate; i++) {
			rotateonce(array);
		}
		return array;
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


	static void shuffleArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			swapAtIndex(array, i, random.nextInt(array.length));
		}
	}

	static void swapAtIndex(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
