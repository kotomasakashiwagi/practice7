import java.util.InputMismatchException;

public class Question2 implements Question {
    @Override
    public void run() {
        Dog dog2 = new Dog();
        dog2.SetName("ペガサス");
        dog2.SetAge(15);
        dog2.ShowProfile();
    }
}
