package CombinatorialProblems;

import java.util.Scanner;

public class VariationswithoutRepetition {
   public static String[] inputArr;
   public static int n;
   public static String[] slots;
   public static boolean[] used;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        inputArr = scanner.nextLine().split(" ");
        n = Integer.parseInt(scanner.nextLine());

        slots = new String[n];
        used = new boolean[inputArr.length];


        variations(0);
    }

    private static void variations(int index) {

        if (index == slots.length){
            print();
        }else {
            for (int i = 0; i < inputArr.length; i++) {
                if (!used[i]){
                    used[i] = true;
                    slots[index] = inputArr[i];
                    variations(index + 1);
                    used[i] = false;

                }
            }

        }
    }

    private static void print() {
        System.out.println(String.join(" ", slots));
    }
}
