// DECORATOR — Resonac NOS system

public class ResonacNOS extends NOS {

    public ResonacNOS(Car car) {
        super(car);
    }

    @Override
    public void carInfo() {
        decoratedCar.carInfo();
        System.out.println("  [NOS] Resonac NOS Kit installed.");
    }

    @Override
    public void activateNOS() {
        System.out.println("[NOS] Resonac NOS activated!");
    }

    @Override
    public void accelerate() {
        decoratedCar.accelerate();
        activateNOS();
    }

    @Override
    public void stop() {
        System.out.println("[NOS] Resonac NOS system disarmed.");
        decoratedCar.stop();
    }
}
