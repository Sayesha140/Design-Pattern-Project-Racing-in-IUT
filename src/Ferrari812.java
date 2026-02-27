// Roadster category

public class Ferrari812 extends Car {
    public Ferrari812(Engine engine, Turbocharger turbo) {
        super(engine, turbo);
    }

    @Override
    public void carInfo() {
        System.out.println("==========================================");
        System.out.println("  Car   : Ferrari 812");
        System.out.println("  Type  : Roadster");
        System.out.println("==========================================");
        printBehaviors();
    }
}
