import java.util.Scanner;

public class TrackSelectionHandler {

    public static Track selectTrack(Scanner sc) {
        Enums.TrackType trackType = null;
        while (trackType == null) {
            System.out.println("\n--- Choose Your Track ---");
            for (Enums.TrackType type : Enums.TrackType.values()) {
                System.out.println("  " + type.getCode() + ". " + type.getDisplayName() +
                        " (" + type.getLocation() + ")");
            }
            System.out.print("Your choice: ");

            // Check if input is an integer
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                trackType = Enums.TrackType.fromCode(choice);
                if (trackType == null) {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                String invalid = sc.next(); // consume the invalid input
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return TrackFactory.createTrack(trackType);
    }
}