public class EngineFactory {

    public static Engine createEngine(Enums.EngineType engineType) {
        if (engineType == null) return null;

        switch (engineType) {
            case V6: return new V6Engine();
            case V8: return new V8Engine();
            case V12: return new V12Engine();
            default: return null;
        }
    }
}
