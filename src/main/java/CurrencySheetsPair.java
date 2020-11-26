public class CurrencySheetsPair {
    private final Coin coin;
    private final int sheets;

    public CurrencySheetsPair(Coin coin, int sheets) {
        this.coin = coin;
        this.sheets = sheets;
    }

    public Coin getCoin() {
        return this.coin;
    }

    public int getSheets() {
        return this.sheets;
    }
}
