package CombinatorialProblems;

import java.util.Scanner;

public class NChooseKCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int k = Integer.parseInt(scanner.nextLine());

        int binom = chooseN(n, k);
        System.out.println(binom);

    }

    private static int chooseN(int n, int k) {
        if (k > n){
            return 0;
        }
        if (k == 0 || k == n){
            return 1;
        }
        return chooseN(n -1, k - 1) + chooseN(n - 1, k);
    }
}
