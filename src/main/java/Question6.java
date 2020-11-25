import java.util.InputMismatchException;

public class Question6 implements Question {
    @Override
    public void run() {
        try {
            CoinCase coinCase = new CoinCase();
            CoinScanner.scanTenCurrencyAndSheetsPair(coinCase);
            for (Coin coin : coinCase.getKey()) {
                CoinPrinter.printCountOfAllCoinsAndSubTotal(coin, coinCase.getCount(coin));
            }
            int totalCount = coinCase.getTotalCount();
            IntPrinter.printSumOfCount(totalCount);
            int amount = coinCase.getAmount();
            IntPrinter.printSumOfMoney(amount);
        } catch (InputMismatchException e) {
            System.err.println("正しい数字を入力してください。");
        }
    }

}
