package hashmap;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by User-01 on 25.5.2016 г..
 */
public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, HashMap<String, BigDecimal>> countries = new LinkedHashMap<>();
        HashMap<String, BigDecimal> totalPopulation = new HashMap<>();
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("report")) {
                break;
            }
            String[] params = input.split("\\|");
            String country = params[1];
            String city = params[0];
            BigDecimal population = new BigDecimal(params[2]);
            countries.putIfAbsent(country, new LinkedHashMap<>());

            countries.get(country).put(city, population);
            totalPopulation.putIfAbsent(country, BigDecimal.ZERO);
            totalPopulation.put(country, totalPopulation.get(country).add(population));
        }

        totalPopulation.entrySet().stream().sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                .forEach(e -> {
                    System.out.println(e.getKey() + " (total population: " + e.getValue() + ")");
                    countries.get(e.getKey()).entrySet().stream()
                            .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                            .forEach(ci -> System.out.println("=>" + ci.getKey() + ": " + ci.getValue()));

                });


    }
}