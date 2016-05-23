import java.util.Scanner;

/**
 * Created by User-01 on 14.5.2016 г..
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split("\\W+");
        System.out.println(input.length);
    }

}
