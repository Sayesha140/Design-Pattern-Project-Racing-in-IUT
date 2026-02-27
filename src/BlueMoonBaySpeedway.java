public class BlueMoonBaySpeedway extends Track {

    @Override
    public void trackInfo() {
        System.out.println("==========================================");
        System.out.println("  Track    : Blue Moon Bay Speedway");
        System.out.println("  Location : USA");
        System.out.println("==========================================");
    }

    @Override
    public void startLine() {
        System.out.println("[Track] Blue Moon Bay Speedway — STARTING LINE!");
    }

    @Override
    public void finishLine() {
        System.out.println("[Track] Blue Moon Bay Speedway — Reached FINISH LINE!");
    }
}
