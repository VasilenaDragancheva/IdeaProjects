import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User-01 on 13.5.2016 г..
 */
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String substring = scanner.nextLine();

        int counter = 0;
        int end = line.length() - substring.length();
        for (int i = 0; i <= end; i++) {
            boolean isMatch = line.regionMatches(true,i,substring,0,substring.length());
            if(isMatch){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
