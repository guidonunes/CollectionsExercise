import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Double> gradesStudents = new HashMap<>();

        gradesStudents.put("Maria", 9.5);
        gradesStudents.put("Sarah", 7.8);
        gradesStudents.put("Grant", 8.7);
        gradesStudents.put("Bradley", 5.5);

        System.out.println("Sarah's grade is: " + gradesStudents.get("Sarah"));
        gradesStudents.put("Sarah", 9.0);
        System.out.println("Sarah's updated grade is: " + gradesStudents.get("Sarah"));

        gradesStudents.remove("Bradley");
        System.out.println("Updated Map after Bradley's removal: " + gradesStudents);

        System.out.println("\nStudents and grades:");
        for(Map.Entry<String, Double> entry : gradesStudents.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
     }
}
