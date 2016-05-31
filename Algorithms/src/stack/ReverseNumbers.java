package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by User-01 on 22.5.2016 г..
 */
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String number :
                input) {
            stack.push(Integer.parseInt(number));
        }

        while (!stack.isEmpty()) {
            int number = stack.pop();
            System.out.print(number + " ");
        }
    }
}
