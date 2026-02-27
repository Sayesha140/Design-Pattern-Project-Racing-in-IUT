// TEMPLATE PATTERN — Circuit race

public class CircuitRace extends Race {

    @Override
    protected void finishLine(Track track) {
        System.out.println("[Circuit Race] Completing the loop — returning to the START of the track...");
        track.finishLine();
    }
}
