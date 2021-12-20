package SearchingSortinanGreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Qucksort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr =  Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        sortQuck(numsArr, 0, numsArr.length - 1);

    }

    private static void sortQuck(int[] numsArr, int low, int high) {
        if (low < high){
            int pi = patrittion(numsArr, low, high);

            sortQuck(numsArr, low, pi - 1);
            sortQuck(numsArr, pi - 1, high);
        }
    }

    private static int patrittion(int[] numsArr, int low, int high) {
        int i = 0;
        if (low < 0 ){
            return low = 0;
        }
        int pivot = numsArr[high];
         i = low - 1;

        for (int j = low; j < high; j++) {
            if (numsArr[j] <= pivot){
                i++;

                int temp = numsArr[i];
                numsArr[i] = numsArr[j];
                numsArr[j] = temp;
            }
        }
        int temp = numsArr[i + 1];
        numsArr[i + 1] = numsArr[high];
        numsArr[high] = temp;
        return i + 1;
    }
}
