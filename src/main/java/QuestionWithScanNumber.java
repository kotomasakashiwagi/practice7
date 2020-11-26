import java.util.InputMismatchException;

abstract class QuestionWithScanNumber implements Question {
    protected abstract void runQuestion(CoinCase coinCase);

    @Override
    public void run() {
        try {
            CoinCase coinCase = new CoinCase();
            CoinScanner.scanTenCurrencyAndSheetsPair(coinCase);
            runQuestion(coinCase);
        } catch (InputMismatchException e) {
            System.err.println("正しい数字を入力してください。");
        }

    }
}
