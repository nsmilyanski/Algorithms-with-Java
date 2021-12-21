package SearchingSortinanGreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr =  Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        int buffer = getIndex(numsArr, n);


        System.out.println(buffer);
    }

    private static int getIndex(int[] numsArr, int key) {
        int start = 0;
        int end = numsArr.length - 1;

        int mid =0;

        while (end >= start){
            mid = (start + end)/2;

            if (key < numsArr[mid]){
                end = mid -1;
            }else if (key > numsArr[mid]){

                end = mid +1;
            }else {
                return mid;
            }
        }
        return mid;
    }
}
