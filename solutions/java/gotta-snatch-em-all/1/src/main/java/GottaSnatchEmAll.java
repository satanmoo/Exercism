import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(final List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(final String card, final Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(final Set<String> myCollection, final Set<String> theirCollection) {
        return !(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection));
    }

    static Set<String> commonCards(final List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return Set.of();
        }

        var common = new java.util.HashSet<>(collections.getFirst());
        for (Set<String> collection : collections) {
            common.retainAll(collection);
        }

        return common;
    }

    static Set<String> allCards(final List<Set<String>> collections) {
        var all = new java.util.HashSet<String>();
        for (Set<String> collection : collections) {
            all.addAll(collection);
        }

        return all;
    }
}
