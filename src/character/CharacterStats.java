package character;

public class CharacterStats {
    private int strength, agility, intelligence;

    private int maxHp, currentHp;

    public CharacterStats() {
        strength = 10;
        agility = 10;
        intelligence = 10;
        maxHp = 100;
        currentHp = 100;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void changeHp(int delta) {
        currentHp += delta;

        if (currentHp > maxHp) {
            currentHp = maxHp;
        } else if (currentHp < 0) {
            currentHp = 0;
        }
    }
}
