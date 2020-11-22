public class Dog {
    private String Name;
    private int age;
    private String DogBreed;

    public void SetName(String nm) {
        Name = nm;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    Dog(String DogBreed) {
        this.DogBreed = DogBreed;
    }

    Dog() {

    }

    public void ShowProfile() {
        System.out.println(DogBreed + " 名前は、" + Name + "。 年齢は、" + age + "歳です。");
    }


}
