// FACTORY PATTERN — creates Track instances

public class TrackFactory {

    public static Track createTrack(Enums.TrackType trackType) {
        if (trackType == null) return null;

        switch (trackType) {
            case BLUE_MOON_BAY:
                return new BlueMoonBaySpeedway();
            case BB_RACEWAY:
                return new BBRaceway();
            case SPA_FRANCORCHAMPS:
                return new CircuitDeSpaFrancorchamps();
            default:
                return null;
        }
    }
}