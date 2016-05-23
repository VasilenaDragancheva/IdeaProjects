import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by User-01 on 13.5.2016 г..
 */
public class MagicExchangbleWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(areExchangable(scanner.next(),scanner.next()));
    }

    public static boolean areExchangable(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        HashMap<Character, Character> macher = new HashMap<>();

        for (int i = 0; i < first.length(); i++) {
            char key = first.charAt(i);
            char value = second.charAt(i);
            if (macher.containsKey(key)) {
                if (macher.get(key) != value) {
                    return false;
                }
            } else {
                macher.put(key, value);
            }
        }

        return true;
    }


}
