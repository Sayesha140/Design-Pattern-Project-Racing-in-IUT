// ABSTRACT FACTORY PATTERN — interface for car category factories

public interface CarFactory {
    Car createCar(Enums.CarModel model, Engine engine, Turbocharger turbo);
}