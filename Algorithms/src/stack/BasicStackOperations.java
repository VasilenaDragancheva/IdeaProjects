package stack;

import java.util.*;

/**
 * Created by User-01 on 22.5.2016 г..
 */
public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        if (n == s) {
            System.out.println(0);
        } else {
            String[] numbers = scanner.nextLine().split("\\s+");
            for (int i = 0; i < n - s; i++) {
                stack.push(Integer.parseInt(numbers[i]));
            }
            if(stack.contains(x)){
                System.out.println(true);
            }else{
                System.out.println(Collections.min(stack));
            }

        }
    }
}
