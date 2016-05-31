package hashmap;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Created by User-01 on 25.5.2016 г..
 */
public class LogsAggregator {
    public static void main(String[] args) {
        TreeMap<String, HashSet<String>> userIps = new TreeMap<>();
        TreeMap<String, Long> useDuration = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String ip = input[0];
            String user = input[1];
            Long duration = Long.parseLong(input[2]);
            userIps.putIfAbsent(user, new HashSet<>());
            userIps.get(user).add(ip);
            useDuration.putIfAbsent(user, 0L);
            useDuration.put(user, useDuration.get(user) + duration);
        }
        useDuration.entrySet().stream().forEach(usr -> {
            System.out.println(String.format("%s: %d %s", usr.getKey(), usr.getValue(),
                    userIps.get(usr.getKey()).stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).toString()));
        });

    }
}
