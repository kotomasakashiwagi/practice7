public enum Coin {
    FiveHundred(500),
    Hundred(100),
    Fifty(50),
    Ten(10),
    Five(5),
    One(1);

    private int value;

    Coin(int value) {
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public static Coin convertCoinFromValue(int value) {
        for (Coin coin : Coin.values()) {
            if (coin.getValue() == (value)) {
                return coin;
            }
        }
        throw new UnsupportedOperationException("そのお金は存在しません。");
    }
}
