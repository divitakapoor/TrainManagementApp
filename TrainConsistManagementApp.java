import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC6 (Map with capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("BG101", 72);  // Sleeper
        bogieCapacity.put("BG102", 56);  // AC Chair
        bogieCapacity.put("BG103", 24);  // First Class

        System.out.println("\nOriginal Bogie Data:");
        System.out.println(bogieCapacity);

        // ---------------- UC7 START ----------------

        // Convert Map to List
        List<Map.Entry<String, Integer>> bogieList =
                new ArrayList<>(bogieCapacity.entrySet());

        // Sort using Comparator (by capacity descending)
        bogieList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> b1,
                               Map.Entry<String, Integer> b2) {
                return b2.getValue() - b1.getValue(); // Descending
            }
        });

        System.out.println("\nBogies Sorted by Capacity (High → Low):");
        for (Map.Entry<String, Integer> entry : bogieList) {
            System.out.println("Bogie ID: " + entry.getKey()
                    + " → Capacity: " + entry.getValue());
        }

        // ---------------- UC7 END ----------------
    }
}