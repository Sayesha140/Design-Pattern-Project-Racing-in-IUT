import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

// TEMPLATE PATTERN — Race method defines fixed sequence of steps

public abstract class Race {

    // Template method - now accepts Scanner
    public final void race(Car car, Track track, Scanner sc) {
        car.carInfo();
        track.trackInfo();
        startCar(car);
        startLine(track);
        accelerateCar(car);

        // pitStop - pass scanner for user input
        NOS nosCar = pitStop(car, sc);

        if (nosCar != null) {
            applyNos(nosCar);
            finishLine(track);
            stopCar(nosCar);
        } else {
            finishLine(track);
            stopCar(car);
        }

        lapTime();
    }

    protected void startCar(Car car) {
        car.start();
    }

    protected void startLine(Track track) {
        track.startLine();
    }

    protected void accelerateCar(Car car) {
        car.accelerate();
    }

    protected NOS pitStop(Car car, Scanner sc) {
        System.out.println("\n[PitStop] Entering pit stop...");

        // Use NOSSelectionHandler with the passed scanner
        NOS nosCar = NOSSelectionHandler.selectNOS(sc, car);

        if (nosCar != null) {
            System.out.println("[PitStop] " +
                    (nosCar instanceof ResonacNOS ? "Resonac" : "Sema") +
                    " NOS kit fitted!");
        }

        System.out.println("[PitStop] Exiting pit stop...\n");
        return nosCar;
    }

    protected void applyNos(NOS nos) {
        System.out.println("[Race] Back on track — NOS armed!");
        nos.accelerate();
    }

    protected abstract void finishLine(Track track);

    protected void stopCar(Car car) {
        car.stop();
    }

    protected void lapTime() {
        Random rand = new Random();
        long millis = (long) rand.nextInt(3600) * 1000
                + rand.nextInt(60) * 1000
                + rand.nextInt(1000);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        String time = sdf.format(new Date(millis));
        System.out.println("\n*** Lap Time: " + time + " ***");
    }
}