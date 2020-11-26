import java.util.*;

public class CoinCase {
    private EnumMap<Coin, Integer> coinCounter = new EnumMap<Coin, Integer>(Coin.class) {
        {//コインはenum
            put(Coin.FiveHundred, 0);
            put(Coin.Hundred, 0);
            put(Coin.Fifty, 0);
            put(Coin.Ten, 0);
            put(Coin.Five, 0);
            put(Coin.One, 0);
        }
    };

    public void addCoins(Coin coin, int sheets) {
            coinCounter.put(coin, coinCounter.get(coin) + sheets);
            //スレッドセーフになっていない
    }

    public int getCount(Coin coin) {
        return coinCounter.get(coin);
    }

    public int getAmount() {
        return coinCounter.keySet().stream().mapToInt(key -> key.getValue() * coinCounter.get(key)).sum();
    }

    public int getCount() {
        return coinCounter.values().stream().mapToInt(sheets -> sheets).sum();
    }

    public Set<Coin> getKey() {
        return coinCounter.keySet();
    }
    //お金と枚数のペアをsetにする
    public Set<CurrencySheetsPair> getSetCurrencySheetsPair(){
        Set<CurrencySheetsPair> setCurrencySheets = new HashSet<>();
        for(Map.Entry<Coin,Integer> entry : coinCounter.entrySet()){
            setCurrencySheets.add(new CurrencySheetsPair(entry.getKey(),entry.getValue()));
        }
        return setCurrencySheets;
    }
}
