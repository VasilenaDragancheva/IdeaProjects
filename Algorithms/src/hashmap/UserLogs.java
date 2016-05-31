package hashmap;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by User-01 on 25.5.2016 г..
 */
public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Integer>> data = new TreeMap<String, LinkedHashMap<String, Integer>>();
        String command = "";
        while (true) {
            command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            String[] params = command.split("\\s+");
            String ip = params[0].substring(3);
            String message = params[1].length() == 10 ? "" : params[1].substring(9, params[1].length() - 2);
            String user = params[2].substring(5);
            data.putIfAbsent(user, new LinkedHashMap<>());
            data.get(user).putIfAbsent(ip, 0);
            data.get(user).put(ip, data.get(user).get(ip) + 1);
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry :
                data.entrySet()) {
            System.out.println(entry.getKey() + ":");
            List<String> output = entry.getValue().entrySet().stream().map(ip -> ip.getKey() + " => " + ip.getValue()).collect(Collectors.toList());
            System.out.println(String.join(", ", output) + ".");

        }
    }
}
