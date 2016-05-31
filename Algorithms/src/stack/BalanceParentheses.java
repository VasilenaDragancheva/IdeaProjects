package stack;

import java.util.*;

/**
 * Created by User-01 on 23.5.2016 г..
 */
public class BalanceParentheses {
    public static void main(String[] args) {

        Map<Character, Character> matchers = new HashMap<Character, Character>();
        matchers.put('[', ']');
        matchers.put('{', '}');
        matchers.put('(', ')');
        Collection<Character> openingValues = matchers.keySet();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<Character> opening = new Stack<Character>();

        boolean isBalanced = true;
     if(input.length()%2==1){
         System.out.println("NO");
         return;
     }
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (openingValues.contains(current)) {
                opening.push(current);
            } else {
                char lastOpened = opening.pop();
                if (matchers.get(lastOpened) != current) {
                    isBalanced = false;
                    break;
                }
            }
        }
        System.out.println(isBalanced ? "YES" : "NO");

    }
}