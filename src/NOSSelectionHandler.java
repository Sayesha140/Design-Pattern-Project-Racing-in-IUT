import java.util.Scanner;

public class NOSSelectionHandler {

    public static NOS selectNOS(Scanner sc, Car car) {
        Enums.NOSOption nosOption = null;
        while (nosOption == null) {
            System.out.println("\n--- Choose NOS Option (Optional) ---");
            for (Enums.NOSOption option : Enums.NOSOption.values()) {
                System.out.println("  " + option.getCode() + ". " + option.getDisplayName());
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            nosOption = Enums.NOSOption.fromCode(choice);
            if (nosOption == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        return NOSFactory.createNOS(nosOption, car);
    }
}