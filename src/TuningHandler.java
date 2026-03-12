import java.util.Scanner;

public class TuningHandler {

    public static void tuneCar(Scanner sc, Car car) {
        boolean tuning = true;

        while (tuning) {
            System.out.println("\n--- Tune Your Car or start the race? ---");
            for (Enums.TuneMenu option : Enums.TuneMenu.values()) {
                System.out.println("  " + option.getCode() + ". " + option.getDisplayName());
            }

            Enums.TuneMenu choice = null;
            while (choice == null) {
                System.out.print("Your choice: ");
                int input = sc.nextInt();
                choice = Enums.TuneMenu.fromCode(input);
                if (choice == null) {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

            switch (choice) {
                case START_RACE:
                    tuning = false;
                    break;

                case CHANGE_ENGINE:
                    changeEngine(sc, car);
                    break;

                case CHANGE_TURBO:
                    changeTurbo(sc, car);
                    break;
            }
        }
    }

    private static void changeEngine(Scanner sc, Car car) {
        Enums.EngineType newEngineType = null;
        while (newEngineType == null) {
            System.out.println("\n--- Choose New Engine ---");
            for (Enums.EngineType type : Enums.EngineType.values()) {
                System.out.println("  " + type.getCode() + ". " + type.getDisplayName());
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            newEngineType = Enums.EngineType.fromCode(choice);
            if (newEngineType == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        Engine newEngine = EngineFactory.createEngine(newEngineType);
        car.setEngine(newEngine);
        System.out.println(" Engine updated to " + newEngineType.getDisplayName() + "!");
    }

    private static void changeTurbo(Scanner sc, Car car) {
        Enums.TurboType newTurboType = null;
        while (newTurboType == null) {
            System.out.println("\n--- Choose New Turbocharger ---");
            for (Enums.TurboType type : Enums.TurboType.values()) {
                System.out.println("  " + type.getCode() + ". " + type.getDisplayName());
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            newTurboType = Enums.TurboType.fromCode(choice);
            if (newTurboType == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        Turbocharger newTurbo = TurboFactory.createTurbo(newTurboType);
        car.setTurbocharger(newTurbo);
        System.out.println(" Turbocharger updated to " + newTurboType.getDisplayName() + "!");
    }
}