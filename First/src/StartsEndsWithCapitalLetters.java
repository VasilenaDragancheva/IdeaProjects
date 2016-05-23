import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User-01 on 13.5.2016 г..
 */
public class StartsEndsWithCapitalLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b([A-Z][a-zA-Z]*[A-Z])\\b");
        Matcher matcher = pattern.matcher(line);
        List<String> words= new ArrayList<String>();
        while (matcher.find()){
            words.add(matcher.group());
        }

        System.out.println(String.join(" ",words));
    }
}
