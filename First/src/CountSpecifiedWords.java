import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by User-01 on 13.5.2016 г..
 */
public class CountSpecifiedWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().toLowerCase();
        String word = scanner.nextLine();
        String regexPatt = String.format("\\b%s\\b", word);
        Pattern pattern = Pattern.compile(regexPatt);
        Matcher matcher = pattern.matcher(line);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter);

    }
}
