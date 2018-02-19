package world;

public class Location {
    private World instance;
    private int x;
    private int y;

    public Location(World instance, int x, int y) {

        this.instance = instance;
        this.x = x;
        this.y = y;
    }
}
