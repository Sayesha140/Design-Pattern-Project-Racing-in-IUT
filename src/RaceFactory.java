public class RaceFactory {

    public static Race createRace(Enums.RaceType raceType) {
        if (raceType == null) return null;

        switch (raceType) {
            case SPRINT: return new SprintRace();
            case CIRCUIT: return new CircuitRace();
            default: return null;
        }
    }
}