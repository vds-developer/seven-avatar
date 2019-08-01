package algorithm;

import java.util.List;

public class Utility {
    public static double[] swap(double[] array, int index1, int index2) {
        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public static double[] deepCopy (double[] array) {
        double[] copy = new double[array.length];
        for (int i = 0; i< array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static void printSteps (List<double[]> sortedList) {
        sortedList.forEach(step -> {
            System.out.print("|\t");
            for (double value : step) {
                System.out.print(value + "\t");
            }
            System.out.print("|\n");
        });
    }
}
