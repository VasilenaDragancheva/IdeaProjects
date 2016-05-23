import java.util.*;

/**
 * Created by User-01 on 22.5.2016 г..
 */
public class BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<Integer> numbers = new LinkedList<Integer>();
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        if (n == s) {
            System.out.println(0);
        } else {
            String[] numbersInput = scanner.nextLine().split("\\s+");
            for (int i = 0; i < n; i++) {
                numbers.offer(Integer.parseInt(numbersInput[i]));

            }
            for (int i = 0; i < s; i++) {
                numbers.poll();
            }

            String result=numbers.contains(x)? "true": Collections.min(numbers).toString();
            System.out.println(result);
        }
    }
}

