public class Question5 extends QuestionWithScanNumber {
    @Override
    public void runQuestion(CoinCase coinCase) {
        for (Coin coin : coinCase.getKey()) {
            CoinPrinter.printCountOfAllCoins(coin, coinCase.getCount(coin));
        }
        int amount = coinCase.getAmount();
        IntPrinter.printSumOfMoney(amount);
    }
}
