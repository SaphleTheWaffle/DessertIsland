package world;

import java.util.Random;

public class World {
    private Tile[][] map;

    public World(int height, int width) {
        map = new Tile[height][width];
        Random r = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[i][j] = new Tile(Biome.valueOf(r.nextInt(8)));
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < map[0].length; j++) {
                sb.append(map[i][j].getBiome().symbol);
            }
            System.out.println(sb.toString());
        }
    }
}
