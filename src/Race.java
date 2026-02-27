import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

// TEMPLATE PATTERN — Race method defines fixed sequence of steps

public abstract class Race {

    // Template method
    public final void race(Car car, Track track, NOS nosCar) {
        car.carInfo();
        track.trackInfo();
        startCar(car);
        startLine(track);
        accelerateCar(car);

        // pitStop - only if NOS is provided
        if (nosCar != null) {
            Car carWithNOS = pitStop(nosCar);
            // g) applyNos
            applyNos((NOS) carWithNOS);
            finishLine(track);
            stopCar(carWithNOS);
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

    protected Car pitStop(NOS nosCar) {
        System.out.println("\n[PitStop] Entering pit stop...");
        System.out.println("[PitStop] " + (nosCar instanceof ResonacNOS ? "Resonance" : "Sema") + " NOS kit ready!");
        System.out.println("[PitStop] Exiting pit stop...\n");
        return nosCar;
    }

    protected void applyNos(NOS nos) {
        System.out.println("[Race] Back on track — NOS armed!");
        nos.accelerate();
    }


    protected abstract void finishLine(Track track); //abstract method

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