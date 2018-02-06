package world;

class Tile {
    private Biome biome;

    Tile(Biome biome) {
        this.biome = biome;
    }

    Biome getBiome() {
        return biome;
    }
}
