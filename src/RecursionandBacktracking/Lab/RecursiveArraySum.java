package RecursionandBacktracking.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = getSum(numArr, numArr.length - 1);
        System.out.println(sum);
    }

    private static int getSum(int[] numArr, int num) {

        if (num <= 0){
            return numArr[num];
        }


        return numArr[num] + getSum(numArr, num - 1);
    }
}
