package CombinatorialProblems;

import java.util.Scanner;

public class PermutationswithoutRepetition {
   public  static String[] perm;
   public static String[] elements;
   public static boolean[] used;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split(" ");
        used = new boolean[elements.length];
        perm = new String[elements.length];

        printPermutatioms( 0);
    }

    private static void printPermutatioms(int index) {
        if (index == elements.length){
            printSolution(perm);
        }else {
            for (int i = 0; i < elements.length; i++) {
                if (!used[i]){
                    used[i] = true;
                    perm[index] = elements[i];
            printPermutatioms( index + 1);
                    used[i] = false;
                }
            }
        }
    }

    private static void printSolution(String[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            if (i == inputArr.length - 1){
                System.out.printf("%s", inputArr[i]);
            }else {
                System.out.printf("%s ", inputArr[i]);
            }
        }
            System.out.println();
    }
}
