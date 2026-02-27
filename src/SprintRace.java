// TEMPLATE PATTERN — Sprint race: finish line is at the END of the track

public class SprintRace extends Race {

    @Override
    protected void finishLine(Track track) {
        System.out.println("[Sprint Race] Moving towards the END of the track...");
        track.finishLine();
    }
}
