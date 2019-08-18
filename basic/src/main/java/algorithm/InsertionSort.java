package algorithm;

import javax.rmi.CORBA.Util;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public static List<double[]> sort(double[] unsortedArray) {
        List<double[]> sortedArray = new LinkedList<>();
        if (unsortedArray == null || unsortedArray.length == 0) return sortedArray;
        if (unsortedArray.length == 1) {
            sortedArray.add(Utility.deepCopy(unsortedArray));
            return sortedArray;
        }

        sortedArray.add(Utility.deepCopy(unsortedArray));

        for (int i = 1; i < unsortedArray.length; i++) {
            int current = i;
            for (int j = i - 1; j >= 0; j--) {
                if (unsortedArray[j] > unsortedArray[current]) {
                    Utility.swap(unsortedArray, j, current);
                    current = j;
                }
            }
            sortedArray.add(Utility.deepCopy(unsortedArray));
        }
        return sortedArray;
    }

    public static void print(List<double[]> sortedList) {
        System.out.println("Insertion Sort Starting...\n");
        System.out.println("Running time is O(n^2)...\n");
        Utility.printSteps(sortedList);
        System.out.println("\nDone");
    }

}
