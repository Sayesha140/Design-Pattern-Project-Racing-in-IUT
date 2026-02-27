// Coupe category

public class ToyotaGR86 extends Car {
    public ToyotaGR86(Engine engine, Turbocharger turbo) {
        super(engine, turbo);
    }

    @Override
    public void carInfo() {
        System.out.println("==========================================");
        System.out.println("  Car   : Toyota GR86");
        System.out.println("  Type  : Coupe");
        System.out.println("==========================================");
        printBehaviors();
    }
}
