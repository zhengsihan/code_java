package enumPractice;

public enum Game {
    XENOBLADE("XB", "NITENDO"),
    GOD_OF_WAR("GOW", "SONY");

    private final String name;
    private final String publicer;
    Game(String name, String publicer){
        this.name = name;
        this.publicer = publicer;
    }

    public String getName() {
        return name;
    }

    public String getPublicer() {
        return publicer;
    }
}
