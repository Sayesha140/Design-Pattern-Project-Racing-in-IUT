public class RoadsterFactory implements CarFactory {

    @Override
    public Car createCar(Enums.CarModel model, Engine engine, Turbocharger turbo) {
        switch (model) {
            case PORSCHE_BOXSTER:
                return new PorscheBoxster(engine, turbo);
            case FERRARI_812:
                return new Ferrari812(engine, turbo);
            default:
                return null;
        }
    }
}