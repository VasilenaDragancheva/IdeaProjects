import java.util.Scanner;

/**
 * Created by User-01 on 13.5.2016 г..
 */
public class SequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            if (i == 0) {
                System.out.print(input[i]);
            } else if (input[i].equals(input[i - 1])) {
                System.out.print(" " + input[i]);
            } else {
                System.out.println();
                System.out.print(input[i]);
            }
        }
    }
}
