import java.util.Scanner;

public class CoinScanner {
    private static final int TEN = 10;

    public static CurrencySheetsPair scanCurrencyAndSheetsPair() {
            Coin anEnum = null;
            int sheets = -1;
            while (sheets < 0) {
                Scanner scan = new Scanner(System.in);
                int currency = scan.nextInt();
                if(Coin.getEnum(currency) == null){
                    System.out.println("正しい硬貨の数字を入力してください。");
                   continue;
                }
                anEnum = Coin.getEnum(currency);
                sheets = scan.nextInt();
                if (sheets < 0)
                    System.out.println("非負の数字を入力してください。");
            }
            return new CurrencySheetsPair(anEnum, sheets);

    }

    public static CoinCase scanTenCurrencyAndSheetsPair(CoinCase coinCase) {
        for (int i = 0; i < TEN; i++) {
            System.out.println("硬貨と枚数を入力してください。例 : 100 7");
            CurrencySheetsPair currencySheetsPair = scanCurrencyAndSheetsPair();
            coinCase.addCoins(currencySheetsPair.getCoin(), currencySheetsPair.getSheets());
        }
        return coinCase;
    }

}
