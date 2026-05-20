class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

final class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

final class Wizard extends Fighter {
    private boolean isPrepared;

    void prepareSpell() {
        isPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        return !isPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (isPrepared) {
            return 12;
        } else {
            return 3;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
