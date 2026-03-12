import java.util.Scanner;

public class RaceSelectionHandler {

    public static Race selectRace(Scanner sc) {
        Enums.RaceType raceType = null;
        while (raceType == null) {
            System.out.println("\n--- Choose Race Type ---");
            for (Enums.RaceType type : Enums.RaceType.values()) {
                System.out.println("  " + type.getCode() + ". " + type.getDescription());
            }
            System.out.print("Your choice: ");

            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                raceType = Enums.RaceType.fromCode(choice);
                if (raceType == null) {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                String invalid = sc.next();
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return RaceFactory.createRace(raceType);
    }
}