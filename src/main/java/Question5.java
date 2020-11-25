import java.util.InputMismatchException;
import java.util.Set;

public class Question5 implements Question {
    @Override
    public void run() {
        try {
            CoinCase coinCase = new CoinCase();
            CoinScanner.scanTenCurrencyAndSheetsPair(coinCase);
            Set<CurrencySheetsPair> setCurrencySheetsPair = coinCase.getSetCurrencySheetsPair();
            for (CurrencySheetsPair currencySheetsPair : setCurrencySheetsPair) {
                CoinPrinter.printCountOfAllCoins(currencySheetsPair.getCurrency()
                        , currencySheetsPair.getSheets());
            }
            int amount = coinCase.getAmount();
            IntPrinter.printSumOfMoney(amount);
        } catch (InputMismatchException e) {
            System.err.println("正しい数字を入力してください。");
        }
    }

}
