package CombinatorialProblems;

import java.util.Scanner;

public class CombinationswithoutRepetition {
    public  static String[] elements;
    public static String[] slots;
    public static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split(" ");

        n = Integer.parseInt(scanner.nextLine());

        slots = new String[n];

        combination(0, 0);


    }

    private static void combination(int index, int start) {
        if (index == n){
            print();
        }else {
            for (int i = start; i < elements.length; i++) {
                slots[index] = elements[i];
                combination(index + 1, i + 1);
            }
        }
    }

    private static void print() {
        System.out.println(String.join(" ", slots));

    }
}
