import java.util.Scanner;

public class CoinScanner {
    private static final int TEN = 10;

    public static CurrencySheetsPair scanCurrencyAndSheetsPair() {
        //Coin coin ;
        //int sheets = -1;//質問
        for (int i = 0; i < 3; i++) {
            Scanner scannedInt = new Scanner(System.in);
            int currency = scannedInt.nextInt();
            Coin coin;
            try {
                coin = Coin.convertCoinFromValue(currency);
            } catch (UnsupportedOperationException e) {
                System.err.println(e.getMessage());
                continue;
            }
            int sheets = scannedInt.nextInt();
            if (sheets < 0) {
                System.err.println("非負の数字を入力してください。");
                continue;
            }
            return new CurrencySheetsPair(coin, sheets);
        }
        throw new IllegalArgumentException("正しい数字を入力してください。");
    }

    public static void scanTenCurrencyAndSheetsPair(CoinCase coinCase) {
        try {
            for (int i = 0; i < TEN; i++) {
                System.out.println("硬貨と枚数を入力してください。例 : 100 7");
                CurrencySheetsPair currencySheetsPair = scanCurrencyAndSheetsPair();
                coinCase.addCoins(currencySheetsPair.getCoin(), currencySheetsPair.getSheets());
            }
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
            System.exit(0);
        }
    }

}
