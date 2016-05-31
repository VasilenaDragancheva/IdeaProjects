package algorithms;

import java.util.Scanner;

/**
 * Created by User-01 on 24.5.2016 г..
 */
public class RecursiveFibonacci {

    public static long[] allFibonacci;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        n++;
        allFibonacci = new long[n];
        allFibonacci[0] = 1;
        allFibonacci[1] = 1;
        long fibbonaci = GetFibonacciNumber(n);
        System.out.println(fibbonaci);
    }

    private static long GetFibonacciNumber(int n) {
        if (allFibonacci[n-1] == 0) {
            long current = GetFibonacciNumber(n - 1) + GetFibonacciNumber(n - 2);
            allFibonacci[n-1] = current;
            return current;
        }
        return allFibonacci[n-1];
    }
}