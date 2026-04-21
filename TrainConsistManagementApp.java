import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String id;
    String type;     // Sleeper, AC Chair, First Class, Goods
    int capacity;

    public Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return id + "(" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie objects
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("BG101", "Sleeper", 72));
        bogies.add(new Bogie("BG102", "AC Chair", 56));
        bogies.add(new Bogie("BG103", "First Class", 24));
        bogies.add(new Bogie("BG104", "Sleeper", 80));
        bogies.add(new Bogie("BG105", "Goods", 100));

        // ---------------- UC9 START ----------------

        // Group bogies by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogies:");

        for (String type : groupedBogies.keySet()) {
            System.out.println(type + " Bogies: " + groupedBogies.get(type));
        }

        // ---------------- UC9 END ----------------
    }
}