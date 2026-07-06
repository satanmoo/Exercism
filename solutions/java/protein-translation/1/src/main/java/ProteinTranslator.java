import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    private static final Map<String, String> CODONS = Map.ofEntries(
            Map.entry("AUG", "Methionine"),
            Map.entry("UUU", "Phenylalanine"),
            Map.entry("UUC", "Phenylalanine"),
            Map.entry("UUA", "Leucine"),
            Map.entry("UUG", "Leucine"),
            Map.entry("UCU", "Serine"),
            Map.entry("UCC", "Serine"),
            Map.entry("UCA", "Serine"),
            Map.entry("UCG", "Serine"),
            Map.entry("UAU", "Tyrosine"),
            Map.entry("UAC", "Tyrosine"),
            Map.entry("UGU", "Cysteine"),
            Map.entry("UGC", "Cysteine"),
            Map.entry("UGG", "Tryptophan"),
            Map.entry("UAA", "STOP"),
            Map.entry("UAG", "STOP"),
            Map.entry("UGA", "STOP"));

    List<String> translate(final String rnaSequence) {
        final List<String> result = new ArrayList<String>();
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            if (i + 2 < rnaSequence.length()) {
                final String codon = rnaSequence.substring(i, i + 3);
                final String aminoAcid = CODONS.get(codon);

                if (aminoAcid == null) {
                    throw new IllegalArgumentException("Invalid codon");
                }

                if (aminoAcid.equals("STOP")) {
                    return result;
                }
                result.add(aminoAcid);
            } else {
                throw new IllegalArgumentException("Invalid codon");
            }
        }
        return result;
    }
}
