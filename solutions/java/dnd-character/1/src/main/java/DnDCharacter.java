import java.util.ArrayList;
import java.util.List;

final class DnDCharacter {

    private final int strength = ability(rollDice());
    private final int dexterity = ability(rollDice());
    private final int constitution = ability(rollDice());
    private final int intelligence = ability(rollDice());
    private final int wisdom = ability(rollDice());
    private final int charisma = ability(rollDice());

    int ability(final List<Integer> scores) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
            sum += score;
        }

        return sum - min;
    }

    List<Integer> rollDice() {
        var results = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            results.add((int) (Math.random() * 6) + 1);
        }

        return results;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
