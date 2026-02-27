public class
Enums {
    public enum EngineType {
        V6(1, "V6"),
        V8(2, "V8"),
        V12(3, "V12");

        private final int code;
        private final String displayName;

        EngineType(int code, String displayName) {
            this.code = code;
            this.displayName = displayName;
        }

        public int getCode() { return code; }
        public String getDisplayName() { return displayName; }

        public static EngineType fromCode(int code) {
            for (EngineType type : values()) {
                if (type.code == code) return type;
            }
            return null;
        }
    }

    public enum TurboType {
        ALPINE(1, "Alpine"),
        CUMMINS(2, "Cummins"),
        HONEYWELL(3, "Honeywell");

        private final int code;
        private final String displayName;

        TurboType(int code, String displayName) {
            this.code = code;
            this.displayName = displayName;
        }

        public int getCode() { return code; }
        public String getDisplayName() { return displayName; }

        public static TurboType fromCode(int code) {
            for (TurboType type : values()) {
                if (type.code == code) return type;
            }
            return null;
        }
    }

    public enum CarCategory {
        COUPE(1, "Coupe"),
        ROADSTER(2, "Roadster");

        private final int code;
        private final String displayName;

        CarCategory(int code, String displayName) {
            this.code = code;
            this.displayName = displayName;
        }

        public int getCode() { return code; }
        public String getDisplayName() { return displayName; }

        public static CarCategory fromCode(int code) {
            for (CarCategory category : values()) {
                if (category.code == code) return category;
            }
            return null;
        }
    }

    public enum CarModel {
        TOYOTA_GR86(1, "Toyota GR86", CarCategory.COUPE),
        SUBARU_BRZ(2, "Subaru BRZ", CarCategory.COUPE),
        PORSCHE_BOXSTER(3, "Porsche Boxster", CarCategory.ROADSTER),
        FERRARI_812(4, "Ferrari 812", CarCategory.ROADSTER);

        private final int code;
        private final String displayName;
        private final CarCategory category;

        CarModel(int code, String displayName, CarCategory category) {
            this.code = code;
            this.displayName = displayName;
            this.category = category;
        }

        public int getCode() { return code; }
        public String getDisplayName() { return displayName; }
        public CarCategory getCategory() { return category; }

        public static CarModel fromCode(int code) {
            for (CarModel model : values()) {
                if (model.code == code) return model;
            }
            return null;
        }
    }

    public enum TrackType {
        BLUE_MOON_BAY(1, "Blue Moon Bay Speedway", "USA"),
        BB_RACEWAY(2, "BB Raceway", "Japan"),
        SPA_FRANCORCHAMPS(3, "Circuit de Spa-Francorchamps", "Germany");

        private final int code;
        private final String displayName;
        private final String location;

        TrackType(int code, String displayName, String location) {
            this.code = code;
            this.displayName = displayName;
            this.location = location;
        }

        public int getCode() { return code; }
        public String getDisplayName() { return displayName; }
        public String getLocation() { return location; }

        public static TrackType fromCode(int code) {
            for (TrackType type : values()) {
                if (type.code == code) return type;
            }
            return null;
        }
    }

    public enum RaceType {
        SPRINT(1, "Sprint (finish line = END of track)"),
        CIRCUIT(2, "Circuit (finish line = START of track)");

        private final int code;
        private final String description;

        RaceType(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int getCode() { return code; }
        public String getDescription() { return description; }

        public static RaceType fromCode(int code) {
            for (RaceType type : values()) {
                if (type.code == code) return type;
            }
            return null;
        }
    }

    public enum NOSOption {
        NONE(0, "None"),
        RESONAC(1, "Resonac"),
        SEMA(2, "Sema");

        private final int code;
        private final String displayName;

        NOSOption(int code, String displayName) {
            this.code = code;
            this.displayName = displayName;
        }

        public int getCode() { return code; }
        public String getDisplayName() { return displayName; }

        public static NOSOption fromCode(int code) {
            for (NOSOption option : values()) {
                if (option.code == code) return option;
            }
            return null;
        }
    }

    public enum YesNo {
        YES(1, "Yes"),
        NO(2, "No");

        private final int code;
        private final String displayName;

        YesNo(int code, String displayName) {
            this.code = code;
            this.displayName = displayName;
        }

        public int getCode() { return code; }
        public String getDisplayName() { return displayName; }

        public static YesNo fromCode(int code) {
            for (YesNo option : values()) {
                if (option.code == code) return option;
            }
            return null;
        }
    }
}
