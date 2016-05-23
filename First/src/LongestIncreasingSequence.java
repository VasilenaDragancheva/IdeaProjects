import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User-01 on 14.5.2016 г..
 */
public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.asList(scanner.nextLine().split("\\s+")).stream().mapToInt(Integer::parseInt).toArray();
        int longestStart = 0;
        int longestCount = 1;
        int currentCount = 0;
        int currentStart = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0 && numbers[i - 1] < numbers[i]) {
                currentCount++;
            } else {
                if(currentCount>longestCount){
                    longestCount = currentCount;
                    longestStart = currentStart;
                }
                System.out.println();
                currentCount = 1;
                currentStart = i;
            }
            System.out.print(numbers[i] + " ");
        }

        if(currentCount>longestCount){
            longestCount = currentCount;
            longestStart = currentStart;

        }
        System.out.println();
        System.out.print("Longest count : ");
        for (int i = longestStart; i <longestStart+longestCount ; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
