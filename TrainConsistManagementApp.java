import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize
        List<String> bogies = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + bogies.size());

        // ---------------- UC2 ----------------
        bogies.add("Sleeper Bogie");
        bogies.add("AC Chair Bogie");
        bogies.add("First Class Bogie");

        System.out.println("\nAfter adding passenger bogies:");
        System.out.println("Total number of bogies: " + bogies.size());
        System.out.println("Current Train Consist: " + bogies);

        // ---------------- UC3 START ----------------

        // Set to track unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs
        addBogieId(bogieIds, "BG101");
        addBogieId(bogieIds, "BG102");
        addBogieId(bogieIds, "BG101"); // Duplicate (should be rejected)

        System.out.println("\nUnique Bogie IDs: " + bogieIds);

        // ---------------- UC3 END ----------------
    }

    // Method to safely add bogie IDs
    public static void addBogieId(Set<String> bogieIds, String id) {
        if (bogieIds.add(id)) {
            System.out.println("Bogie ID " + id + " added successfully.");
        } else {
            System.out.println("Duplicate Bogie ID " + id + " not allowed!");
        }
    }
}