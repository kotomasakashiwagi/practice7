public class CurrencySheetsPair {
    private final Coin currency;
    private final int sheets;

    public CurrencySheetsPair(Coin coin, int sheets) {
        this.currency = coin;
        this.sheets = sheets;
    }

    public Coin getCurrency() {
        return this.currency;
    }

    public int getSheets() {
        return this.sheets;
    }
}
