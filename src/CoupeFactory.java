// ABSTRACT FACTORY — Coupe category factory

public class CoupeFactory implements CarFactory {

    @Override
    public Car createCar(Enums.CarModel model, Engine engine, Turbocharger turbo) {
        switch (model) {
            case TOYOTA_GR86:
                return new ToyotaGR86(engine, turbo);
            case SUBARU_BRZ:
                return new SubaruBRZ(engine, turbo);
            default:
                return null;
        }
    }
}