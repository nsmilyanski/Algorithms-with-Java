package RecursionandCombinatorialProblems_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NestedLoops {
    public  static int n;
    public static int[] numsArr;
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

         n = Integer.parseInt(bufferedReader.readLine());

         numsArr = new int[n];

         permute( 0);
    }

    private static void permute( int index) {
        if (index == numsArr.length){
            print();
        }else {
            for (int i = 1; i <= n; i++) {
                numsArr[index] = i;
                permute(index + 1);
            }
        }
    }

    private static void print() {
        for (int n: numsArr) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}
