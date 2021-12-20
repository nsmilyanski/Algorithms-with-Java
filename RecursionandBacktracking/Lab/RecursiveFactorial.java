package RecursionandBacktracking.Lab;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        long fact = factorial(n);
        System.out.println(fact);
    }

    private static long factorial(int n) {
        if (n <= 0){
            return 1;
        }

        return n*factorial(n - 1);
    }
}
