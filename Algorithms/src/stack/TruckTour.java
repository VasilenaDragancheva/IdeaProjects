package stack;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by User-01 on 23.5.2016 г..
 */
public class TruckTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pump[] pumps = new Pump[n];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            BigDecimal amount = new BigDecimal(input[0]);
            BigDecimal distance = new BigDecimal(input[1]);
            pumps[i] = new Pump(amount, distance);

        }

    }
}

class Pump {
    private BigDecimal petrolAmount;
    private BigDecimal distance;

    public Pump(BigDecimal petrolAmount, BigDecimal disctance) {
        this.petrolAmount = petrolAmount;
        this.distance = disctance;
    }

    public BigDecimal getPetrolAmount() {
        return this.petrolAmount;
    }

    public BigDecimal getDistance() {
        return this.distance;
    }
}