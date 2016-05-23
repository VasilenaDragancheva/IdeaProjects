import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Scanner;

import static java.math.BigInteger.*;

/**
 * Created by User-01 on 22.5.2016 г..
 */
public class SequenceWithQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = BigDecimal.valueOf(Long.parseLong(scanner.nextLine()));
        ArrayDeque<BigDecimal> numbers = new ArrayDeque<BigDecimal>();
        System.out.print(n + " ");
        numbers.offer(n);
        for (int i = 0; i < 50 / 3; i++) {
            BigDecimal current = numbers.pollFirst();
            BigDecimal increment = current.add(BigDecimal.ONE);
            numbers.offer(increment);
            System.out.print(increment + " ");
            BigDecimal multiply = increment.add(current);
            numbers.offer(multiply);
            System.out.print(multiply + " ");
            BigDecimal incrementWith2 =current.add(BigDecimal.valueOf(2));
            numbers.offer(incrementWith2);
            System.out.print(incrementWith2 + " ");

        }
        BigDecimal current = numbers.pollFirst();
        BigDecimal increment = current.add(BigDecimal.ONE);
        System.out.print(increment + " ");

    }
}
