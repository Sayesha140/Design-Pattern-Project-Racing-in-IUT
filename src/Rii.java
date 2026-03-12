import java.util.Scanner;

public class Rii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║         Welcome to Racing In IUT!        ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // create player
        System.out.print("\nEnter your name: ");
        String name = sc.next();
        Player player = Player.getInstance(name);

        // Select car
        Car car = CarSelectionHandler.selectCar(sc);

        // Select track
        Track track = TrackSelectionHandler.selectTrack(sc);

        // Select race type
        Race race = RaceSelectionHandler.selectRace(sc);

        // Tune car
        TuningHandler.tuneCar(sc, car);

        // RACE Starting
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║  " + player.getName() + "'s Race is Starting!                   ║");
        System.out.println("╚══════════════════════════════════════════╝\n");


        race.race(car, track, sc);

        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║    Race Over! Great run, " + player.getName() + "!              ║");
        System.out.println("╚══════════════════════════════════════════╝");

        sc.close();
    }
}