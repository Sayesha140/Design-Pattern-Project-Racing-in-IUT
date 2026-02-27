public class BBRaceway extends Track {

    @Override
    public void trackInfo() {
        System.out.println("==========================================");
        System.out.println("  Track    : BB Raceway");
        System.out.println("  Location : Japan");
        System.out.println("==========================================");
    }

    @Override
    public void startLine() {
        System.out.println("[Track] BB Raceway — STARTING LINE! Get set!");
    }

    @Override
    public void finishLine() {
        System.out.println("[Track] BB Raceway — Reached FINISH LINE!!");
    }
}
