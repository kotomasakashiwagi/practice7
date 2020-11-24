public class OutOfQuestion implements Question {
    @Override
    public void run() {
        System.err.println("正しい問題番号を入力してください。");
    }
}
