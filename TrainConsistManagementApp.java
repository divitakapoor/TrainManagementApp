import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty list of bogies
        List<String> bogies = new ArrayList<>();

        // UC1 Output
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + bogies.size());

        // ---------------- UC2 START ----------------

        // Adding passenger bogies
        bogies.add("Sleeper Bogie");
        bogies.add("AC Chair Bogie");
        bogies.add("First Class Bogie");

        System.out.println("\nAfter adding passenger bogies:");
        System.out.println("Total number of bogies: " + bogies.size());
        System.out.println("Current Train Consist: " + bogies);

        // Checking if a bogie exists
        String checkBogie = "AC Chair Bogie";
        if (bogies.contains(checkBogie)) {
            System.out.println(checkBogie + " is present in the train.");
        } else {
            System.out.println(checkBogie + " is NOT present in the train.");
        }

        // Removing a bogie
        bogies.remove("Sleeper Bogie");

        System.out.println("\nAfter removing Sleeper Bogie:");
        System.out.println("Total number of bogies: " + bogies.size());
        System.out.println("Updated Train Consist: " + bogies);

        // ---------------- UC2 END ----------------
    }
}