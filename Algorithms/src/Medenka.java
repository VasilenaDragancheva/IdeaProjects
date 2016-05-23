import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User-01 on 16.5.2016 г..
 */
public class Medenka {

    public static int count;
    public static List<Pair> delimiterPlaces = new ArrayList<Pair>();
    public static int[] currentPlaces ;
    public static String[] medenka;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        medenka = scanner.nextLine().split("\\s+");
        List<Integer> nutIndexes = new ArrayList<Integer>();


        for (int i = 0; i < medenka.length; i++) {

            if (medenka[i].equals("1")) {
                nutIndexes.add(i);
            }
        }
        for (int i = 0; i < nutIndexes.size() - 1; i++) {
            delimiterPlaces.add(new Pair(nutIndexes.get(i), nutIndexes.get(i + 1) - 1));
        }

        count = delimiterPlaces.size();
        currentPlaces = new int[count-1];
        int delimiterNumber = 0;

        if (count == 0) {
            System.out.println(String.join("", medenka));
        } else {
            int delimiterPosition = delimiterPlaces.get(delimiterNumber).getStart();
            PlaceDelimiter(delimiterNumber);
        }
    }

    private static void PlaceDelimiter(int delimiterNumber) {
        if (delimiterNumber == count) {
            PrintMedenka();
            return;
        }
        int start = delimiterPlaces.get(delimiterNumber).getStart();
        int end = delimiterPlaces.get(delimiterNumber).getEnd();
        for (int i = start; i <= end; i++) {
            currentPlaces[delimiterNumber]=i;
            PlaceDelimiter(delimiterNumber + 1);
        }
    }

    private static void PrintMedenka() {
        for (int i = 0; i < medenka.length; i++) {
            System.out.print(medenka[i]);
           if(Arrays.binarySearch(currentPlaces,i)!=-1){
               System.out.print("|");
           }
        }
        System.out.println();

    }


    static class Pair {

        private int start;
        private int end;

        public Pair(int start, int end) {
            this.setStart(start);
            this.setEnd(end);
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }
}
