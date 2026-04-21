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

        // UC3
        Set<String> bogieIds = new HashSet<>();
        addBogie(bogieIds, "BG101");
        addBogie(bogieIds, "BG102");
        addBogie(bogieIds, "BG101"); // duplicate

        // ---------------- UC4 START ----------------

        // LinkedList to maintain order of train
        LinkedList<String> trainSequence = new LinkedList<>();

        // Add bogies in real train order
        addToTrain(trainSequence, bogieIds, "BG101");
        addToTrain(trainSequence, bogieIds, "BG102");

        // Adding special positions
        trainSequence.addFirst("Engine");
        trainSequence.addLast("Guard Coach");

        System.out.println("\nTrain Sequence (Ordered):");
        System.out.println(trainSequence);

        // ---------------- UC4 END ----------------
    }

    // UC3 helper
    public static void addBogie(Set<String> bogieIds, String id) {
        if (bogieIds.add(id)) {
            System.out.println("Bogie ID " + id + " added.");
        } else {
            System.out.println("Duplicate Bogie ID " + id + " rejected!");
        }
    }

    // UC4 helper
    public static void addToTrain(LinkedList<String> train, Set<String> ids, String id) {
        if (ids.contains(id)) {
            train.add(id);
        } else {
            System.out.println("Invalid Bogie ID " + id + " (not registered)");
        }
    }
}