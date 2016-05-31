package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by User-01 on 24.5.2016 г..
 */
public class StackFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Stack<Long> fibonaccis = new Stack<Long>();
        fibonaccis.push(1L);
        fibonaccis.push(1L);

        for (int i = 0; i < n - 1; i++) {
            long last = fibonaccis.pop();
            long previus = fibonaccis.peek();
            fibonaccis.push(last);
            fibonaccis.push(last + previus);
        }
        System.out.println(fibonaccis.peek());
    }
}
