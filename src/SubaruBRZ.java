// Coupe category

public class SubaruBRZ extends Car {
    public SubaruBRZ(Engine engine, Turbocharger turbo) {
        super(engine, turbo);
    }

    @Override
    public void carInfo() {
        System.out.println("==========================================");
        System.out.println("  Car   : Subaru BRZ");
        System.out.println("  Type  : Coupe");
        System.out.println("==========================================");
        printBehaviors();
    }
}
