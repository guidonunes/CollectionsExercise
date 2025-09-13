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

        System.out.println("\nType the number of the film of your choice (0 to end): ");
        int vote;

        do {
            vote = sc.nextInt();
            if (vote > 0 && vote <= films.size()) {
                int index = vote - 1;
                votes.set(index, votes.get(index) + 1);
            } else if (vote != 0) {
                System.out.println("Invalid option. Try again.");
            }
        } while (vote!= 0);

        int maxVotes = 0;
        int winnerIndex = -1;

        for (int i = 0; i < votes.size(); i++) {
            if(votes.get(i) > maxVotes) {
                maxVotes = votes.get(i);
                winnerIndex = i;
            }
        }

        if (winnerIndex != -1) {
            System.out.println("\nThe winner is..." + films.get(winnerIndex) + " with " + maxVotes + " votes!");
        } else {
            System.out.println("\nNo films were voted.");
        }
        sc.close();

    }
}
