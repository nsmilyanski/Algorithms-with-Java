package RecursionandCombinatorialProblems_Exercise;

import java.util.Scanner;

public class ReverseArray {
   public static String[] numsArr;
   public  static String[] output;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        numsArr = scanner.nextLine().split(" ");
        output = new String[numsArr.length];

        permute(numsArr, numsArr.length - 1);
    }

    private static void permute(String[] numsArr, int index) {
        if (index < 0){
            return;
        }else {
            System.out.printf("%s ", numsArr[index]);
            permute(numsArr, index - 1);
        }
    }

    }

