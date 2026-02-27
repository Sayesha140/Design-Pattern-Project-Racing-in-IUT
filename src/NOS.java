// DECORATOR PATTERN

public abstract class NOS extends CarDecorator {

    public NOS(Car car) {
        super(car);
    }

    public abstract void activateNOS();
}
