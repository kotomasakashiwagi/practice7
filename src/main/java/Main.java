public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("引数の数はひとつで,問題番号である必要があります。");
            System.exit(0);
        }

        QuestionSelector.selectQuestion(args[0]);
    }
}
