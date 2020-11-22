public class Question3 implements Question {
    @Override
    public void run() {
        Dog dog3_1 = new Dog();
        dog3_1.SetName("サンゴ");
        dog3_1.SetAge(3);
        dog3_1.ShowProfile();
        Dog dog3_2 = new Dog();
        dog3_2.SetName("ジュウゴ");
        dog3_2.SetAge(15);
        dog3_2.ShowProfile();
    }

}
