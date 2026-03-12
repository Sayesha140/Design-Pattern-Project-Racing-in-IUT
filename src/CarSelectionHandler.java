import java.util.Scanner;

public class CarSelectionHandler {

    public static Car selectCar(Scanner sc) {
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
        return factory.createCar(selectedModel, engine, turbo);
    }
}