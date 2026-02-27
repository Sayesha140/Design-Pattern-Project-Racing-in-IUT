public abstract class Car {
    protected Engine engine;
    protected Turbocharger turbo;

    public Car(Engine engine, Turbocharger turbo) {
        this.engine = engine;
        this.turbo  = turbo;
    }

    // STRATEGY PATTERN — change behaviors at runtime
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("[Car] Engine updated!");
    }

    public void setTurbocharger(Turbocharger turbo) {
        this.turbo = turbo;
        System.out.println("[Car] Turbocharger updated!");
    }

    public abstract void carInfo();

    public void start() {
        System.out.println("[Car] " + getClass().getSimpleName() + " engine started. Vroom!");
    }

    public void stop() {
        System.out.println("[Car] " + getClass().getSimpleName() + " engine stopped.");
    }

    public void accelerate() {
        System.out.println("[Car] " + getClass().getSimpleName() + " is accelerating!!!");
    }

    protected void printBehaviors() {
        engine.engineInfo();
        turbo.turboInfo();
    }
}
