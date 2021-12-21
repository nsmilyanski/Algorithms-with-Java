package CombinatorialProblems;

import java.sql.Array;
import java.util.HashSet;
import java.util.Scanner;

public class PermutationswithRepetition {
   public static String[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        array= scanner.nextLine().split(" ");



        permute(0);


    }

    private static void permute(int index) {
        if (index == array.length){
            print();
        }else {
            HashSet<String> swapped = new HashSet<>();
            permute(index + 1);
            swapped.add(array[index]);
            for (int i = index + 1; i < array.length; i++) {
                if (!swapped.contains(array[i])) {
                    swap(array, index, i);
                    permute(index + 1);
                    swap(array, index, i);
                    swapped.add(array[i]);
                }
            }
        }
    }

    private static void swap(String[] array, int first, int second) {
        String temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static void print() {
        System.out.println(String.join(" ", array));
    }
}
