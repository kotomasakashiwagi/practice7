import java.util.InputMismatchException;

abstract class QuestionWithScanNumber implements Question{
    protected abstract void runQuestion();
    @Override
    public void run(){
        try{
            runQuestion();
        }catch (InputMismatchException e){
            System.err.println("正しい数字を入力してください。");
        }

    }
}
