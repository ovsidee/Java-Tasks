import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arr = {
                "Office A", "John", "Doe",
                "Office B", "John", "Brown",
                "Office C", "Mary", "Jones",
                "Office B", "Adam", "Rust",
                "Office C", "Cindy", "Frost",
                "Office A", "Kate", "Coe",
                "Office A", "Bill", "Brown"
        };

        Map<String, List<Person>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i+=3) {
            String officeName = arr[i];
            String firstName = arr[i + 1];
            String lastName = arr[i + 2];

            Person person = new Person(firstName, lastName);

            map.computeIfAbsent(officeName, (key) -> new ArrayList<>()).add(person);
        }
        for ( Map.Entry<String, List<Person>> entry : map.entrySet() ){
            System.out.println(entry);
        }

        int max = 0;
        String keyForMap = "";
        for (Map.Entry<String, List<Person>> entry : map.entrySet()) {
            int numberOfEmployees = entry.getValue().size();

            if (numberOfEmployees > max) {
                max = numberOfEmployees;
                keyForMap = entry.getKey();
            }
        }


        System.out.println("\n" + keyForMap + ": " + max + " users");
    }
}
