import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> games = new ArrayList<>();

        games.add("Mortal Kombat 1");
        games.add("Pokemon Fire Red");
        games.add("Final Fantasy VII");
        games.add("Fifa 25");
        games.add("World of Warcraft");

        System.out.println("Game at the index 2: " + games.get(2));

        games.set(2, "Death Stranding 2");
        System.out.println("Updated game's list: " + games);

        games.remove("Pokemon Fire Red");
        games.remove(0);
        System.out.println("Updated list after removing items: " + games);

        System.out.println("Updated list size: " + games.size());

        if(games.contains("World of Warcraft")) {
            System.out.println("World of Warcraft is in the list.");
        }

        for(int i = 0; i < games.size(); i++) {
            System.out.println("[" + i + "] = " + games.get(i));
        }

        games.clear();
        System.out.println("Cleaned list: " + games);

        if(games.isEmpty()) {
            System.out.println("The list is empty");
        }

    }
}
