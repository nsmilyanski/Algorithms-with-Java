package SearchingSortinanGreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsList =  Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

       int[] buffer = mergeSort(numsList);

        for (int number: buffer) {
            System.out.print(number + " ");
        }

    }

    private static int[] mergeSort(int[] array) {
        if (array.length == 1){
            return array;
        }

        int halfIndex = array.length/2;

        int firstHalfLength= halfIndex;
        int seconHalfLength = array.length - halfIndex;

        int[] firstPartition = new int[firstHalfLength];
        int[] secondPartition = new int[seconHalfLength];

        for (int i = 0; i < firstHalfLength ; i++) {
            firstPartition[i] = array[i];
        }

        for (int i = firstHalfLength; i < firstHalfLength+ seconHalfLength; i++) {
            secondPartition[i - firstHalfLength] = array[i];

        }

        firstPartition = mergeSort(firstPartition);
        secondPartition = mergeSort(secondPartition);

        int mainIndex = 0;

        int firstPartitionIndex = 0;
        int secondPartitionIndex = 0;

        while (firstPartitionIndex < firstHalfLength && secondPartitionIndex < seconHalfLength){
            if (firstPartition[firstPartitionIndex] < secondPartition[secondPartitionIndex]){
                array[mainIndex] = firstPartition[firstPartitionIndex];

                mainIndex++;
                firstPartitionIndex++;
            }else {
                array[mainIndex] = secondPartition[secondPartitionIndex];

                mainIndex++;
                secondPartitionIndex++;
            }
        }

        while (firstPartitionIndex < firstHalfLength){
            array[mainIndex] = firstPartition[firstPartitionIndex];

            mainIndex++;
            firstPartitionIndex++;
        }

        while (secondPartitionIndex < seconHalfLength){
            array[mainIndex] = secondPartition[secondPartitionIndex];

            mainIndex++;
            secondPartitionIndex++;
        }

        return array;
    }
}
