public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void sleep() {
        System.out.printf("スースー\n");
    }

    @Override
    public void speak() {
        System.out.printf("ニャーニャー\n");
    }


}
