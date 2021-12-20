package RecursionandBacktracking.Lab;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] fibonatchiArr = new int[n];

        int sum = fibonatchi(fibonatchiArr, 0);
    }

    private static int fibonatchi(int[] fibonatchiArr, int index) {
        if (index >= fibonatchiArr.length){

            return fibonatchiArr[index];
        }else {
            for (int i = 0; i < fibonatchiArr.length; i++) {
                if (i == 0){
                    fibonatchiArr[i] = 1;
                    return fibonatchiArr[index] + fibonatchi(fibonatchiArr, index + 1);
                }else if (i == 1){
                    fibonatchiArr[i] = 1;
                    return fibonatchiArr[index] + fibonatchi(fibonatchiArr, index + 1);
                }else {
                    fibonatchiArr[i] = fibonatchiArr[i - 2] + fibonatchiArr[i - 1];
                }
               return fibonatchiArr[index] + fibonatchi(fibonatchiArr, index + 1);
            }
        }
        return fibonatchiArr[index] + fibonatchi(fibonatchiArr, index + 1);
    }

    private static void print(int[] fibonatchiArr) {
        int sum = 0;
        for (int i = fibonatchiArr.length - 2; i < fibonatchiArr.length; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
