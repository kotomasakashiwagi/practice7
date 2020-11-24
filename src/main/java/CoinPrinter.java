public class CoinPrinter {
    public static void printCountOfAllCoins(int currency, int sheets) {
        System.out.println(new StringBuilder().append(currency).append("円 ")
                .append(sheets).append("枚")
                .toString());
    }

    public static void printCountOfAllCoinsAndSubTotal(int currency, int sheets) {
        System.out.println(new StringBuilder().append(currency).append("円 ")
                .append(sheets).append("枚 ")
                .append(currency * sheets).append("円")
                .toString());
    }
}
