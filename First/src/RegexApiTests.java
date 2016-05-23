import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User-01 on 13.5.2016 г..
 */
public class RegexApiTests {
    public static void main(String[] args) {
        String text =
                "Hello, my number in Sofia is +359 894 11 22 33, " +
                        "but in Munich my number is +49 89 975-99222.";
        Pattern phonePattern = Pattern.compile(
                "(\\w+)(\\W+)");
        Matcher matcher = phonePattern.matcher(text);
        while (matcher.find()) {
            System.out.println("|"+matcher.group(1)+"||||"+matcher.group(2)+"|");
        }
    }
}
