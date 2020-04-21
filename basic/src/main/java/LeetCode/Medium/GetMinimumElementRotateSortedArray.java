package LeetCode.Medium;

import LeetCode.generator.ArrayGenerator;
import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

import java.util.Arrays;

public class GetMinimumElementRotateSortedArray {

	public static int GetMinimumElementRotateSortedArray (int[] array) {
		if (array != null || array.length <1 ) return 0;
		return GetMinimumElement(array);

	}

	private static int GetMinimumElement(int[] array) {
		if (array.length == 1) return array[0];
		int middle = array.length / 2;
		int[] left = Arrays.copyOfRange(array, 0, middle);
		int[] right = Arrays.copyOfRange(array, middle, array.length);
		int middleElem = array[middle];

		if (left == null || left.length < 1) return GetMinimumElement(right);
		if (right == null || right.length < 1) return GetMinimumElement(left);

		int minimum = 0;
		if (left[0] > left[left.length - 1]){
			//smallest is in the left side
			 minimum = GetMinimumElement(left);

		} else if (right[0] > right[right.length - 1]) {
			//smallest is in the right side
			 minimum = GetMinimumElement(right);
		} else {
			if (right[0] > left[0]) return left[0];
			if (left[0] >= right[0]) return right[0];
		}
		return minimum;
	}

	public static void main(String[] args) {
		int[] rotateSortedArray = ArrayGenerator.GenerateSortedRotatedIntArray(10);
		for(int i : rotateSortedArray) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println(GetMinimumElement(rotateSortedArray));

	}


}
