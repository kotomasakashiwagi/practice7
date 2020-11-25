public class CoinPrinter {
    public static void printCountOfAllCoins(Coin coin, int sheets) {
        System.out.println(new StringBuilder().append(coin.getValue()).append("円 ")
                .append(sheets).append("枚")
                .toString());
    }

    public static void printCountOfAllCoinsAndSubTotal(Coin coin, int sheets) {
        System.out.println(new StringBuilder().append(coin.getValue()).append("円 ")
                .append(sheets).append("枚 ")
                .append(coin.getValue() * sheets).append("円")
                .toString());
    }
}
