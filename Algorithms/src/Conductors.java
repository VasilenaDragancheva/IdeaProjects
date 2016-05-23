import java.util.Scanner;

/**
 * Created by User-01 on 18.5.2016 г..
 */
public class Conductors {
    public static int perforator;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        perforator = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int ticket = Integer.parseInt(scanner.nextLine());
            System.out.println(perforateTicket(ticket));
        }
    }

    public static int perforateTicket(int ticket) {
        int countOfBits = Integer.toBinaryString(ticket).length();

        int n = Integer.toBinaryString(perforator).length();
        int mask = (int) Math.pow(2, n) - 1;

        int start = 0;
        int end = countOfBits - n;

        while (start <= end) {
            int currentBits = (ticket >> start) & mask;
            if (currentBits == perforator) {
                ticket &= ~(mask << start);
                start += n;
            } else {
                start++;
            }
        }
        return ticket;
    }
}
