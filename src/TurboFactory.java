public class TurboFactory {

    public static Turbocharger createTurbo(Enums.TurboType turboType) {
        if (turboType == null) return null;

        switch (turboType) {
            case ALPINE: return new AlpineTurbo();
            case CUMMINS: return new CumminsTurbo();
            case HONEYWELL: return new HoneywellTurbo();
            default: return null;
        }
    }
}
