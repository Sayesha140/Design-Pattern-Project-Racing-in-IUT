public class PorscheBoxster extends Car {
    public PorscheBoxster(Engine engine, Turbocharger turbo) {
        super(engine, turbo);
    }

    @Override
    public void carInfo() {
        System.out.println("==========================================");
        System.out.println("  Car   : Porsche Boxster");
        System.out.println("  Type  : Roadster");
        System.out.println("==========================================");
        printBehaviors();
    }
}
