package RecursionandBacktracking.Lab;

import java.util.Scanner;

public class GeneratingVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] vector = new int[n];

        gen01(vector, 0);
    }

    private static void gen01(int[] vector, int index) {

        if (index >= vector.length){
            print(vector);
        }else {
            for (int i = 0; i <= 1; i++) {
                vector[index] = i;
                gen01(vector, index + 1);
            }
        }
    }

    private static void print(int[] vector) {
        for (int j : vector) {
            System.out.print(j);
        }
        System.out.println();
    }
}
