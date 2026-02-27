public class NOSFactory {

    public static NOS createNOS(Enums.NOSOption nosOption, Car car) {
        if (nosOption == null || nosOption == Enums.NOSOption.NONE) return null;

        switch (nosOption) {
            case RESONAC: return new ResonacNOS(car);
            case SEMA: return new SemaNOS(car);
            default: return null;
        }
    }
}