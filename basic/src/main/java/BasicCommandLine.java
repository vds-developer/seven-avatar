
import algorithm.BubbleSort;
import algorithm.SelectionSort;
import org.apache.commons.cli.*;

import java.util.Arrays;

public class BasicCommandLine {

    private static String selectionSortStr = "selectionSort";
    private static String bubbleSortStr = "bubbleSort";

    public static void main(String[] args) {
        Options options = new Options();
        Option selectionSort = Option.builder()
                .argName("array").hasArg()
                .desc("Selection Sort. ")
                .numberOfArgs(Option.UNLIMITED_VALUES)
                .valueSeparator(' ')
                .longOpt(selectionSortStr).build();

        Option bubbleSort = Option.builder()
                .argName("array").hasArg()
                .desc("Bubble Sort. ")
                .numberOfArgs(Option.UNLIMITED_VALUES)
                .valueSeparator(' ')
                .longOpt(bubbleSortStr).build();

        options.addOption(selectionSort).addOption(bubbleSort);
        if(args.length == 0 ) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("Sorting Algorithms", options, false);
        }

        CommandLineParser parser = new DefaultParser();
        try {
            // parse the command line arguments
            CommandLine line = parser.parse(options, args);
            sortAndPrint(line);
        }  catch (NullPointerException e) {
            System.out.println("Null Pointer  Reason: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception  Reason: " + e.getMessage());
        }
    }

    private static void sortAndPrint(CommandLine line){
        if (line.hasOption(selectionSortStr)) {
            double[] unsortedArray = Arrays.stream(line.getOptionValues(selectionSortStr)).mapToDouble(Double::parseDouble).toArray();
            SelectionSort.print(SelectionSort.sort(unsortedArray));
        }
        if (line.hasOption(bubbleSortStr)) {
            double[] unsortedArray = Arrays.stream(line.getOptionValues(bubbleSortStr)).mapToDouble(Double::parseDouble).toArray();
            BubbleSort.print(BubbleSort.sort(unsortedArray));
        }

    }
}
