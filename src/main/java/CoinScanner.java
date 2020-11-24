import java.util.Scanner;

public class CoinScanner {
    private static final int TEN = 10;
    public static int scanIntX() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static CurrencySheetsPair scanCurrencyAndSheetsPair() {
        Scanner scan = new Scanner(System.in);
        int currency = scan.nextInt();
        int sheets = scan.nextInt();
        return new CurrencySheetsPair(currency, sheets);
    }

    public static CoinCase scanTenCurrencyAndSheetsPair(CoinCase coinCase) {
        for (int i = 0; i < TEN; i++) {
            System.out.println("硬貨と枚数を入力してください。例 : 100 7");
            CurrencySheetsPair currencySheetsPair = scanCurrencyAndSheetsPair();
            coinCase.addCoins(currencySheetsPair.getCurrency(), currencySheetsPair.getSheets());
        }
        return coinCase;
    }

}
