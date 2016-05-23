import java.util.*;

/**
 * Created by User-01 on 13.5.2016 г..
 */
public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] nums = input.split("\\s+");
        List<Integer> numbers = new ArrayList<Integer>();
        int[] numbersArray = new int[nums.length];
        for (String num : nums) {
            numbers.add(Integer.parseInt(num));
        }
        for (int i = 0; i < numbers.size(); i++) {
            numbersArray[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(numbersArray);

        Collections.sort(numbers);
        for (int i :
                numbersArray) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println(numbers);
    }

    private static void reverse(List<Integer> numbers) {
        int n = numbers.size();
        for (int i = 0; i < n / 2; i++) {
            int num = numbers.get(i);
            numbers.set(i, numbers.get(n - i - 1));
            numbers.set(n - i - 1, num);
        }
    }
}
