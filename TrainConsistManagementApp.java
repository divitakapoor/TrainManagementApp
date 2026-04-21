import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1
        List<String> bogies = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + bogies.size());

        // UC2
        bogies.add("Sleeper Bogie");
        bogies.add("AC Chair Bogie");
        bogies.add("First Class Bogie");

        System.out.println("\nPassenger bogies added:");
        System.out.println(bogies);

        // UC5 (LinkedHashSet for order + uniqueness)
        Set<String> bogieIds = new LinkedHashSet<>();
        addBogie(bogieIds, "BG101");
        addBogie(bogieIds, "BG102");
        addBogie(bogieIds, "BG103");

        System.out.println("\nBogie IDs:");
        System.out.println(bogieIds);

        // ---------------- UC6 START ----------------

        // Map → Bogie ID to Capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Adding capacity data
        bogieCapacity.put("BG101", 72);  // Sleeper
        bogieCapacity.put("BG102", 60);  // AC Chair
        bogieCapacity.put("BG103", 24);  // First Class

        System.out.println("\nBogie Capacity Details:");
        for (String id : bogieCapacity.keySet()) {
            System.out.println("Bogie ID: " + id + " → Capacity: " + bogieCapacity.get(id));
        }

        // Access specific bogie info
        String searchId = "BG102";
        System.out.println("\nCapacity of " + searchId + ": " + bogieCapacity.get(searchId));

        // ---------------- UC6 END ----------------
    }

    public static void addBogie(Set<String> bogieIds, String id) {
        if (bogieIds.add(id)) {
            System.out.println("Bogie ID " + id + " added.");
        } else {
            System.out.println("Duplicate Bogie ID " + id + " rejected!");
        }
    }
}