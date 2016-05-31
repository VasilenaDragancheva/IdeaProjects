package stack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by User-01 on 19.5.2016 г..
 */
public class MaxElementInStack {
    public static LinkedList<Long> sorted = new LinkedList<Long>();

    public static Stack<Long> stack = new Stack<Long>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long max = -1;

        String firstCommand = scanner.nextLine();
        max = Long.parseLong(firstCommand.substring(2));
        stack.push(max);
        sorted.add(max);

        for (int i = 1; i < n; i++) {
            String command = scanner.nextLine();
            switch (command.charAt(0)) {
                case '1':
                    Long number = Long.parseLong(command.substring(2));
                    sorted.add(number);
                    stack.push(number);
                    max = number > max ? number : max;
                    break;
                case '2':
                    number = stack.pop();
                    sorted.remove(number);
                    if (number == max) {
                        max = Collections.max(sorted);
                    }
                    break;
                case '3':
                    System.out.println(max);
                    break;
            }

        }
    }
}
