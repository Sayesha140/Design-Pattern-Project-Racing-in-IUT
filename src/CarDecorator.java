// DECORATOR PATTERN

public abstract class CarDecorator extends Car {
    protected Car decoratedCar;

    public CarDecorator(Car car) {
        super(car.engine, car.turbo);
        this.decoratedCar = car;
    }

    @Override
    public void carInfo() {
        decoratedCar.carInfo();
    }

    @Override
    public void start() {
        decoratedCar.start();
    }

    @Override
    public void stop() {
        decoratedCar.stop();
    }

    @Override
    public void accelerate() {
        decoratedCar.accelerate();
    }
}
