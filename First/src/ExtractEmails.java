import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User-01 on 13.5.2016 г..
 */
public class ExtractEmails {
    public static void main(String[] args) {
        String regPattern = "[a-zA-Z0-9][\\w\\-\\.]*@([A-Za-z]*\\-*[A-Za-z]*\\.)+[A-Za-z]{2,}";
        Pattern pattern = Pattern.compile(regPattern);
        Scanner scanner = new Scanner(System.in);
        String line;
        while (true) {
            line = scanner.nextLine();
            if (line == null || line.isEmpty()) {
                break;
            }

            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        }
    }
}
