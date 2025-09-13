import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        List<String> films = Arrays.asList("The Godfather", "Star Wars", "Startrek", "Harry Potter");

        ArrayList<Integer> votes = new ArrayList<>(Arrays.asList(0,0,0,0));
        Scanner sc = new Scanner(System.in);

        System.out.println("Cast a vote in the film you want to watch tonight: ");
        for (int i = 0; i < films.size(); i++) {
            System.out.println((i + 1) + ". " + films.get(i));
        }

        System.out.println("\nType the number of the film of your choice (0 to end)");
        int vote;

        do {

        } while (vote!= 0);
    }
}
