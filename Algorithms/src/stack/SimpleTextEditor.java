package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by User-01 on 24.5.2016 г..
 */
public class SimpleTextEditor {
    public static StringBuffer result = new StringBuffer();
    public static Stack<String> commandText = new Stack<String>();
    public static Stack<Character> commandsType = new Stack<Character>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            dispatchCommand(command);
        }
    }

    private static void dispatchCommand(String command) {
        char type = command.charAt(0);
        switch (type) {
            case '1':
                result.append(command.substring(2));
                commandsType.push('1');
                commandText.push(command.substring(2));
                break;
            case '2':
                commandsType.push('2');
                int length = Integer.parseInt(command.substring(2));
                String text = result.substring(result.length() - length);
                commandText.push(text);
                result.delete(result.length() - length, result.length());
                break;
            case '3':
                int index = Integer.parseInt(command.substring(2));
                System.out.println(result.charAt(index - 1));// index=input-1;
                break;
            case '4':
                undoCommand(commandsType.pop(), commandText.pop());
                break;
        }
    }

    private static void undoCommand(Character type, String text) {
        if (type == '1') {
            int length = text.length();
            result.delete(result.length() - length, result.length());
        } else {
            result.append(text);
        }
    }

}
