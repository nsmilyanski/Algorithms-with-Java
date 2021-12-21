package RecursionandCombinatorialProblems_Exercise;

import java.util.Scanner;

public class CombinationswithRepetition {
    public static int n, k;
    public static int[] numbersArr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = Integer.parseInt(scanner.nextLine());
        k = Integer.parseInt(scanner.nextLine());

        numbersArr = new int[k];

        combination(0, 1);
    }

    private static void combination(int index, int start) {
        if (index == numbersArr.length){
            printArr();
        }else {
            for (int i = start; i <= n; i++) {
                    numbersArr[index] = i;
                    combination(index + 1, i + 1);
            }
        }
    }

    private static void printArr() {
        for (int n: numbersArr) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}
