public class CircuitDeSpaFrancorchamps extends Track {

    @Override
    public void trackInfo() {
        System.out.println("==========================================");
        System.out.println("  Track    : Circuit de Spa-Francorchamps");
        System.out.println("  Location : Germany");
        System.out.println("==========================================");
    }

    @Override
    public void startLine() {
        System.out.println("[Track] Spa-Francorchamps — STARTING LINE!");
    }

    @Override
    public void finishLine() {
        System.out.println("[Track] Spa-Francorchamps — Reached FINISH LINE! ");
    }
}
