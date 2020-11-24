import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CoinCase {
    private Map<Integer, Integer> coinCaseDetails = new HashMap<Integer, Integer>() {
        {
            put(500, 0);
            put(100, 0);
            put(50, 0);
            put(10, 0);
            put(5, 0);
            put(1, 0);
        }
    };

    public void addCoins(int currency, int sheets) {
        try {
            coinCaseDetails.put(currency, coinCaseDetails.get(currency) + sheets);
        } catch (NullPointerException ignored) {

        }
    }

    public int getCount(int currency) {
        return coinCaseDetails.get(currency);
    }

    public int getAmount() {
        return coinCaseDetails.keySet().stream().mapToInt(key -> key * coinCaseDetails.get(key)).sum();
    }

    public int getTotalCount() {
        return coinCaseDetails.values().stream().mapToInt(sheets -> sheets).sum();
    }

    public Set getKey() {
        return coinCaseDetails.keySet();
    }
}
