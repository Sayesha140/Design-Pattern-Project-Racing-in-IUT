public class CarFactoryProducer {
    public static CarFactory getFactory(Enums.CarCategory category) {
        if (category == Enums.CarCategory.COUPE) {
            return new CoupeFactory();
        } else {
            return new RoadsterFactory();
        }
    }
}
