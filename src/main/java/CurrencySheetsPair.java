public class CurrencySheetsPair {
    private final int currency;
    private final int sheets;

    public CurrencySheetsPair(int currency, int sheets) {
        this.currency = currency;
        this.sheets = sheets;
    }

    public int getCurrency() {
        return this.currency;
    }

    public int getSheets() {
        return this.sheets;
    }
}
