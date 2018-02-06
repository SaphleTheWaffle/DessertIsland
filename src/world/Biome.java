package world;

import java.util.HashMap;
import java.util.Map;

public enum Biome {
    FOREST(0, "Forest", '#'),
    PLAINS(1, "Plains", '.'),
    BEACH(2, "Beach", ','),
    OCEAN(3, "Ocean", '~'),
    LAKE(4, "Lake", '='),
    MOUNTAINS(5, "Mountains", '^'),
    SWAMP(6,  "Swamp", '\"'),
    HILLS(7, "Hills", 'n');

    public int index;
    public String name;
    public char symbol;

    Biome(final int index, String name, char symbol) {
        this.index = index;
        this.name = name;
        this.symbol = symbol;
    }

    private static Map<Integer, Biome> map = new HashMap<>();

    static {
        for (Biome biome : Biome.values()) {
            map.put(biome.index, biome);
        }
    }

    public static Biome valueOf(int index) {
        return map.get(index);
    }
}
