import java.util.HashMap;
import java.util.Map;

public class QuestionSelector {
    private static final Map<String, Question> questionMap = new HashMap<String, Question>() {
        {
            put("7-1", new Question1());
            put("7-2", new Question2());
            put("7-3", new Question3());
            put("7-4", new Question4());
            put("7-5", new Question5());
            put("7-6", new Question6());
            //put("err", new OutOfQuestion());
        }
    };

    public static void selectQuestion(String questionNumber) {
        System.out.println(questionNumber);
        if(questionMap.containsKey(questionNumber)){
            questionMap.get(questionNumber).run();
        } else {
            //questionMap.get("err").run();
            informException();
        }
    }
    public static void informException(){
        System.err.println("正しい問題番号を入力してください。");
    }
}
