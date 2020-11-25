public enum Coin {
    FiveHundred(500),
    Hundred(100),
    Fifty(50),
    Ten(10),
    Five(5),
    One(1),
    ;
    private int value;

    Coin(int value) {
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public static Coin getEnum(int code) {
        for (Coin coin : Coin.values()) {
            if (coin.getValue() == (code)) {
                return coin;
            }
        }
        return null;//よくない
    }

}
