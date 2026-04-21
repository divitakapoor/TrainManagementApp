import java.util.*;

public class TrainApp {

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

        // ---------------- UC5 START ----------------

        // LinkedHashSet → maintains order + uniqueness
        Set<String> bogieIds = new LinkedHashSet<>();

        addBogie(bogieIds, "BG101");
        addBogie(bogieIds, "BG102");
        addBogie(bogieIds, "BG103");
        addBogie(bogieIds, "BG102"); // duplicate

        System.out.println("\nBogie IDs (Insertion Order Preserved):");
        System.out.println(bogieIds);

        // ---------------- UC5 END ----------------
    }

    public static void addBogie(Set<String> bogieIds, String id) {
        if (bogieIds.add(id)) {
            System.out.println("Bogie ID " + id + " added.");
        } else {
            System.out.println("Duplicate Bogie ID " + id + " rejected!");
        }
    }
}