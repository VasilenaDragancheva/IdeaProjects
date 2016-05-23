import java.util.Scanner;

/**
 * Created by User-01 on 11.5.2016 г..
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        System.out.printf("Area of rectangle %d",a*b);
    }
}
