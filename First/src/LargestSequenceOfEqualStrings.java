import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User-01 on 14.5.2016 г..
 */
public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int maxCount = 1;
        String value = input[0];
        int currentCount = 0;
        for (int i = 1; i < input.length; i++) {
            String currentValue = input[i];

            if (!currentValue.equals(input[i - 1])) {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    value = input[i - 1];
                }
                currentCount = 1;
            } else {
                currentCount++;
            }
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
            value = input[input.length-1];
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(value + " ");
        }

    }
}
