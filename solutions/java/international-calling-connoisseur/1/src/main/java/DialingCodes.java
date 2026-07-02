import java.util.HashMap;
import java.util.Map;

public final class DialingCodes {
    private final Map<Integer, String> countryToCode = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return Map.copyOf(this.countryToCode);
    }

    public void setDialingCode(final Integer code, final String country) {
        this.countryToCode.put(code, country);
    }

    public String getCountry(final Integer code) {
        return this.countryToCode.get(code);
    }

    public void addNewDialingCode(final Integer code, final String country) {
        if (!this.countryToCode.containsKey(code) && !this.countryToCode.containsValue(country)) {
            this.countryToCode.put(code, country);
        }
    }

    public Integer findDialingCode(final String country) {
        for (var entry : this.countryToCode.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public void updateCountryDialingCode(final Integer code, final String country) {
        Integer oldCodeOrNull = findDialingCode(country);
        if (oldCodeOrNull == null) {
            return;
        }
        this.countryToCode.remove(oldCodeOrNull);
        this.countryToCode.put(code, country);
    }
}
