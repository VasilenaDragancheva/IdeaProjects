package hashmap;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User-01 on 26.5.2016 г..
 */
public class RubiksMatrix {
    private static int rows;
    private static int cols;
    private static int[][] matrix;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.asList(scanner.nextLine().split("\\s+")).stream().mapToInt(Integer::parseInt).toArray();
        rows = dimensions[0];
        cols = dimensions[1];
        matrix = new int[rows][];
        int count = 1;
        for (int r = 0; r < rows; r++) {
            matrix[r] = new int[cols];
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = count;
                count++;
            }
        }
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            ExecuteSwap(command);
        }

        count = 1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == count) {
                    System.out.println("No swap required");
                } else {

                    for (int i = r; i < rows; i++) {
                        for (int j = i == r ? c + 1 : 0; j < cols; j++) {
                            if (matrix[i][j] == count) {
                                System.out.println(String.format("Swap (%d, %d) with (%d, %d)", r, c, i, j));
                                matrix[i][j] = matrix[r][c];
                                matrix[r][c] = count;
                            }
                        }

                    }
                }
                count++;
            }
        }
    }

    private static void ExecuteSwap(String[] command) {
        int position = Integer.parseInt(command[0]);
        int moves = Integer.parseInt(command[2]);

        if (command[1].equals("left") || command[1].equals("right")) {
            moves %= cols;
            if (moves==0){
                return;
            }
            int start = command[1].equals("right") ? moves : cols - moves;
            int[] original = matrix[position];
            int[] moved = new int[cols];
            for (int i = 0; i < cols; i++) {
                moved[start] = original[i];
                start = start + 1 == cols ? 0 : start + 1;
            }
            matrix[position] = moved;

        } else if (command[1].equals("up") || command[1].equals("down")) {
            moves %= rows;
            if (moves==0){
                return;
            }
            int start = command[1].equals("down") ? rows - moves : moves;
            int[] moved = new int[rows];
            for (int i = 0; i < rows; i++) {
                moved[i] = matrix[start][position];
                start = start + 1 == rows ? 0 : start + 1;
            }
            for (int i = 0; i < rows; i++) {
                matrix[i][position] = moved[i];

            }
        }
    }
}
