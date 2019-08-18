package algorithm;

import java.util.LinkedList;
import java.util.List;

public class SelectionSort {

    public static List<double[]> sort(double[] unsortedArray) {
        List<double[]> sortedArray = new LinkedList<>();
        if (unsortedArray == null || unsortedArray.length == 0) return sortedArray;
        if (unsortedArray.length == 1) {
            sortedArray.add(Utility.deepCopy(unsortedArray));
            return sortedArray;
        }

        sortedArray.add(Utility.deepCopy(unsortedArray));

        for (int i = 0; i < unsortedArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[minIndex]) {
                    minIndex = j;
                }
            }
            Utility.swap(unsortedArray, minIndex, i);
            sortedArray.add(Utility.deepCopy(unsortedArray));
        }
        return sortedArray;
    }

    public static void print(List<double[]> sortedList) {
        System.out.println("Selection Sort Starting...");
        System.out.println("Running time is O(n^2)...\n");
        Utility.printSteps(sortedList);
        System.out.println("\nDone");
    }

}