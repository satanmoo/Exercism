import java.util.Map;

class RnaTranscription {
    private static final Map<Character, Character> TRANSCRIPTION = Map.of(
            'G', 'C',
            'C', 'G',
            'T', 'A',
            'A', 'U'
    );

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder(dnaStrand.length());

        for (char c : dnaStrand.toCharArray()) {
            Character nucleotide = TRANSCRIPTION.get(c);

            if (nucleotide == null) {
                throw new IllegalArgumentException("Invalid nucleotide: " + c);
            }

            sb.append(nucleotide);
        }

        return sb.toString();
    }
}
