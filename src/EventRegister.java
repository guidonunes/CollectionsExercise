import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EventRegister {
    public static void main(String[] args) {
        Set<String> participants = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add a participant" +
                    "\n2. Verify if someone is in the list" +
                    "\n3. Remove a participant" +
                    "\n4. Show participants" +
                    "\n0. Exit" +
                    "\nChoose an option: ");
            option = sc.nextInt();
            sc.nextLine();

            String name;

            switch(option) {
                case 1:
                    System.out.print("Enter the participant name: ");
                    name = sc.nextLine();
                    if (participants.add(name)) {
                        System.out.println(name +  " successfuly added.");
                    } else {
                        System.out.println(name + " is already in the list.");
                    }
                    break;
                case 2:
                    System.out.print("Type a name to check if it is in the list: ");
                    name = sc.nextLine();
                    if(participants.contains(name)) {
                        System.out.println(name + " has signed up to the event already.");
                    } else {
                        System.out.println(name + " hasn't been registered yet.");
                    }
                    break;
                case 3:
                    System.out.print("Type the name of the participant to be removed: ");
                    name = sc.nextLine();
                    if(participants.remove(name)) {
                        System.out.println(name + " has been successfuly removed.");
                    } else {
                        System.out.println(name + " has not been found.");
                    }
                    break;
                case 4:
                    System.out.println("Updated participant's list: ");
                    if(participants.isEmpty()) {
                        System.out.println("The list is currently empty.");
                    } else {
                        for(String participant : participants) {
                            System.out.println("- " + participant);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);
    }
}
