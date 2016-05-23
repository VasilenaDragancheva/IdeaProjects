import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;
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
        if (n == 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < n; i++) {
                int start = i;
                int end = i == 0 ? n - 1 : i - 1;
                boolean isAnswer = true;
                Queue<Pump> circle = new LinkedList<Pump>();
                for (int j = start; j < n; j++) {
                    circle.add(pumps[j]);
                }
                for (int j = 0; j < start; j++) {
                    circle.offer(pumps[j]);
                }
                BigDecimal truckAmount = BigDecimal.ZERO;
                while (circle.size() > 1) {
                    Pump current = circle.poll();
                    truckAmount = truckAmount.add(current.getPetrolAmount());
                    Pump next = circle.peek();
                    if (truckAmount.compareTo(next.getDistance()) < 0) {
                        isAnswer = false;
                        break;
                    } else {
                        truckAmount = truckAmount.subtract(next.getDistance());
                    }
                }
                if (isAnswer) {
                    System.out.println(i);
                    break;
                }
            }
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