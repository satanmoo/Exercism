public class GameMaster {
    public String describe(final Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(final Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(final TravelMethod travelMethod) {
        var travelDescription = switch (travelMethod) {
            case WALKING -> "by walking";
            case HORSEBACK -> "on horseback";
        };

        return "You're traveling to your destination " + travelDescription + ".";
    }

    public String describe(final Character character, final Destination destination, final TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    public String describe(final Character character, final Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
