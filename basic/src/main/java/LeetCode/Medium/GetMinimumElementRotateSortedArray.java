package LeetCode.Medium;

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


		if (right[0] > left[left.length - 1] && left[0] < right [right.length -1] ){
			//smallest is in the left side
			return GetMinimumElement(left);

		} else {
			//smallest is in the right side
			return GetMinimumElement(right)
		}
	}

	public static void main(String[] args) {

	}


}
