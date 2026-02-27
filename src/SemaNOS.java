// DECORATOR — Sema NOS system

public class SemaNOS extends NOS {

    public SemaNOS(Car car) {
        super(car);
    }

    @Override
    public void carInfo() {
        decoratedCar.carInfo();
        System.out.println("  [NOS] Sema NOS Kit installed.");
    }

    @Override
    public void activateNOS() {
        System.out.println("[NOS] Sema NOS activated!");
    }

    @Override
    public void accelerate() {
        decoratedCar.accelerate();
        activateNOS();
    }

    @Override
    public void stop() {
        System.out.println("[NOS] Sema NOS system disarmed.");
        decoratedCar.stop();
    }
}
