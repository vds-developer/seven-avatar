package algorithm;

import java.util.LinkedList;
import java.util.List;

public class BubbleSort {
    public static List<double[]> sort(double[] unsortedArray) {
        List<double[]> sortedArray = new LinkedList<>();
        if (unsortedArray == null || unsortedArray.length == 0) return sortedArray;
        if (unsortedArray.length == 1) {
            sortedArray.add(Utility.deepCopy(unsortedArray));
            return sortedArray;
        }
        sortedArray.add(Utility.deepCopy(unsortedArray));
        boolean swap;
        for (int i = 0; i < unsortedArray.length; i++) {
            swap = false;
            for (int j = 0; j < unsortedArray.length - 1; j++)
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    Utility.swap(unsortedArray, j, j + 1);
                    swap = true;
                }
            sortedArray.add(Utility.deepCopy(unsortedArray));
            if (!swap) break;

        }
        return sortedArray;
    }

    public static void print(List<double[]> sortedList) {
        System.out.println("Bubble Sort Starting...\n\n");
        System.out.println("Running time is O(n^2)...\n");
        Utility.printSteps(sortedList);
        System.out.println("\n\nDone");
    }
}
