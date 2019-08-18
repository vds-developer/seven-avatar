package algorithm;

import javax.rmi.CORBA.Util;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSort {
    private static List<Double> sortedList = new ArrayList<>();
    public static List<double[]> sort(double[] unsortedArray) {
        List<double[]> sortedArray = new LinkedList<>();
//        List<Double> unsortedList = Arrays.stream(unsortedArray).boxed().collect(Collectors.toList());
        if (unsortedArray == null || unsortedArray.length <= 1 ) return sortedArray;
        mergeSort(unsortedArray);
        while (!sortedList.isEmpty()) {
            sortedArray.add(sortedList.subList(0, unsortedArray.length).stream().mapToDouble(Double :: doubleValue).toArray());
            sortedArray.removeAll(sortedList.subList(0, unsortedArray.length));
        }
        return sortedArray;

    }


//    private double[] mergeSort_V2(double[] unsortedArray) {
//        int size = unsortedArray.length;
//        for ( int i = 2 ; i <= size; i *= 2) {
//            for ( int iterator = 1 ; iterator < size ; iterator *= i ) {
//                if (iterator % i == 0) {
//                    //shift 1 back
//                    int leftIndex = iterator - i;
//                    int rightIndex = iterator;
//                    int middleIndex = (leftIndex + rightIndex) / 2;
//                    for ( int subIterator = 0; subIterator < (middleIndex - leftIndex); subIterator ++) {
//                        int subLeft = leftIndex + subIterator;
//                        int subRight = middleIndex + subIterator;
//                        if (unsortedArray[subLeft] > unsortedArray[subRight]) Utility.swap(unsortedArray, subLeft, subRight);
//
//                    }
//                }
//            }
//        }
//    }





    private static double[] mergeSort(double[] unsortedArray) {
        int size = unsortedArray.length;
        if (size < 2 ) {
            return unsortedArray;
        }
        int mid = size / 2;
        double[] left = Arrays.copyOfRange(unsortedArray, 0, mid);
        double[] right = Arrays.copyOfRange(unsortedArray, mid, size);

        List<Double> sortedLeft = Arrays.stream(mergeSort(left)).boxed().collect(Collectors.toList());
        List<Double> sortedRight = Arrays.stream(mergeSort(right)).boxed().collect(Collectors.toList());
        List<Double> sorted = new LinkedList<>();
        while (!sortedLeft.isEmpty() || ! sortedRight.isEmpty()) {
            if (sortedLeft.isEmpty()) sorted.addAll(sortedRight);
            else if (sortedRight.isEmpty()) sorted.addAll(sortedLeft);
            else {
                if (sortedLeft.get(0) <= sortedRight.get(0)) sorted.add(sortedLeft.remove(0));
                else sorted.add(sortedRight.remove(0));
            }
        }
        sortedList.addAll(sorted);
        return sorted.stream().mapToDouble(Double :: doubleValue).toArray();
    }


    public static void print(List<double[]> sortedList) {
        System.out.println("Merge Sort Starting...\n");
        System.out.println("Running time is O(nlogn)...\n");
        Utility.printSteps(sortedList);
        System.out.println("\nDone");
    }
}
