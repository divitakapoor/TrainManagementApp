import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC6 data (Map)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("BG101", 72);  // Sleeper
        bogieCapacity.put("BG102", 56);  // AC Chair
        bogieCapacity.put("BG103", 24);  // First Class
        bogieCapacity.put("BG104", 80);  // Extra High Capacity

        System.out.println("\nAll Bogies:");
        System.out.println(bogieCapacity);

        // ---------------- UC8 START ----------------

        // Filter bogies with capacity >= 50
        List<Map.Entry<String, Integer>> highCapacityBogies =
                bogieCapacity.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() >= 50)
                        .collect(Collectors.toList());

        System.out.println("\nHigh Capacity Bogies (>= 50 seats):");
        for (Map.Entry<String, Integer> entry : highCapacityBogies) {
            System.out.println("Bogie ID: " + entry.getKey()
                    + " → Capacity: " + entry.getValue());
        }

        // ---------------- UC8 END ----------------
    }
}