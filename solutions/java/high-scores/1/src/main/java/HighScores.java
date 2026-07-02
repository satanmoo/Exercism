import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HighScores {

    private final List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return List.copyOf(highScores);
    }

    Integer latest() {
        return highScores.getLast();
    }

    Integer personalBest() {
        var result = Integer.MIN_VALUE;
        for (var score : highScores) {
            if (score > result) {
                result = score;
            }
        }

        return result;
    }

    List<Integer> personalTopThree() {
        int[] sorted = new int[highScores.size()];
        for (int i = 0; i < highScores.size(); i++) {
            sorted[i] = highScores.get(i);
        }

        Arrays.sort(sorted);

        var result = new ArrayList<Integer>();
        int count = Math.min(3, sorted.length);
        for (int i = 0; i < count; i++) {
            result.add(sorted[sorted.length - 1 - i]);
        }

        return result;
    }

}
