import java.util.InputMismatchException;

public class Question1 implements Question {
    @Override
    public void run() {
       Dog dog1 = new Dog();
       dog1.SetName("虎太郎");
       dog1.ShowProfile();
    }
}
