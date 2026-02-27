import java.util.Scanner;

// Rii — Main class
public class Rii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║         Welcome to Racing In IUT!        ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // create player
        System.out.print("\nEnter your name: ");
        String name = sc.next();
        Player player = Player.getInstance(name);

        // Choose Car Category
        Enums.CarCategory selectedCategory = null;
        while (selectedCategory == null) {
            System.out.println("\n--- Choose Car Category ---");
            for (Enums.CarCategory category : Enums.CarCategory.values()) {
                System.out.println("  " + category.getCode() + ". " + category.getDisplayName());
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            selectedCategory = Enums.CarCategory.fromCode(choice);
            if (selectedCategory == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Choose Car Model from selected category
        Enums.CarModel selectedModel = null;
        while (selectedModel == null) {
            System.out.println("\n--- Choose " + selectedCategory.getDisplayName() + " Model ---");
            for (Enums.CarModel model : Enums.CarModel.values()) {
                if (model.getCategory() == selectedCategory) {
                    System.out.println("  " + model.getCode() + ". " + model.getDisplayName());
                }
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            selectedModel = Enums.CarModel.fromCode(choice);
            if (selectedModel == null || selectedModel.getCategory() != selectedCategory) {
                System.out.println("Invalid choice for " + selectedCategory.getDisplayName() + " category. Please try again.");
                selectedModel = null;
            }
        }

        // Choose Engine
        Enums.EngineType engineType = null;
        while (engineType == null) {
            System.out.println("\n--- Choose Engine for " + selectedModel.getDisplayName() + " ---");
            for (Enums.EngineType type : Enums.EngineType.values()) {
                System.out.println("  " + type.getCode() + ". " + type.getDisplayName());
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            engineType = Enums.EngineType.fromCode(choice);
            if (engineType == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        Engine engine = EngineFactory.createEngine(engineType);

        // Choose Turbocharger
        Enums.TurboType turboType = null;
        while (turboType == null) {
            System.out.println("\n--- Choose Turbocharger for " + selectedModel.getDisplayName() + " ---");
            for (Enums.TurboType type : Enums.TurboType.values()) {
                System.out.println("  " + type.getCode() + ". " + type.getDisplayName());
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            turboType = Enums.TurboType.fromCode(choice);
            if (turboType == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        Turbocharger turbo = TurboFactory.createTurbo(turboType);

        // Create the car
        CarFactory factory = CarFactoryProducer.getFactory(selectedCategory);
        Car car = factory.createCar(selectedModel, engine, turbo);

        // OPTIONAL: Swap engine during race
        System.out.println("\n--- Tune Your Car ---");
        Enums.YesNo swapEngine = null;
        while (swapEngine == null) {
            System.out.println("Swap engine?");
            for (Enums.YesNo option : Enums.YesNo.values()) {
                System.out.println("  " + option.getCode() + ". " + option.getDisplayName());
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            swapEngine = Enums.YesNo.fromCode(choice);
            if (swapEngine == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        if (swapEngine == Enums.YesNo.YES) {
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
        }

        Enums.YesNo swapTurbo = null;
        while (swapTurbo == null) {
            System.out.println("\nSwap turbocharger?");
            for (Enums.YesNo option : Enums.YesNo.values()) {
                System.out.println("  " + option.getCode() + ". " + option.getDisplayName());
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            swapTurbo = Enums.YesNo.fromCode(choice);
            if (swapTurbo == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        if (swapTurbo == Enums.YesNo.YES) {
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
        }

        // Choose Track
        Enums.TrackType trackType = null;
        while (trackType == null) {
            System.out.println("\n--- Choose Your Track ---");
            for (Enums.TrackType type : Enums.TrackType.values()) {
                System.out.println("  " + type.getCode() + ". " + type.getDisplayName() +
                        " (" + type.getLocation() + ")");
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            trackType = Enums.TrackType.fromCode(choice);
            if (trackType == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        Track track = TrackFactory.createTrack(trackType);

        // Choose NOS option
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

        NOS nosCar = NOSFactory.createNOS(nosOption, car);

        // Choose Race Type
        Enums.RaceType raceType = null;
        while (raceType == null) {
            System.out.println("\n--- Choose Race Type ---");
            for (Enums.RaceType type : Enums.RaceType.values()) {
                System.out.println("  " + type.getCode() + ". " + type.getDescription());
            }
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            raceType = Enums.RaceType.fromCode(choice);
            if (raceType == null) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        Race race = RaceFactory.createRace(raceType);

        // RACE Starting
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  " + player.getName() + "'s Race is Starting!                   ║");
        System.out.println("╚══════════════════════════════════════════╝\n");

        race.race(car, track, nosCar);

        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║    Race Over! Great run, " + player.getName() + "!              ║");
        System.out.println("╚══════════════════════════════════════════╝");

        sc.close();
    }
}