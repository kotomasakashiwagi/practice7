public class Question6 extends QuestionWithScanNumber {
    @Override
    public void runQuestion() {
        CoinCase coinCase = new CoinCase();
        CoinScanner.scanTenCurrencyAndSheetsPair(coinCase);
        for (Coin coin : coinCase.getKey()) {
            CoinPrinter.printCountOfAllCoinsAndSubTotal(coin, coinCase.getCount(coin));
        }
        int totalCount = coinCase.getCount();
        IntPrinter.printSumOfCount(totalCount);
        int amount = coinCase.getAmount();
        IntPrinter.printSumOfMoney(amount);
    }

}
