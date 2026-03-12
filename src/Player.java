// Singleton Pattern — only one Player can exist per game session

public class Player {
    private static Player instance;
    private String name;

    private Player(String name) {
        this.name = name;
        System.out.println("[Player] Player '" + name + "' created.");
    }

    public static synchronized Player getInstance(String name) {
        if (instance == null) {
            instance = new Player(name);
        } else {
            System.out.println("[Player] Only one player allowed! Existing player: " + instance.name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
