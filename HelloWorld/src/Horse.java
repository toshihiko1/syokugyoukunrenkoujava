public class Horse extends Animal {
    public Horse(String name, int age) {
        super(name, age);
    }

    public void run() {
        System.out.printf("トコトコ\n");
    }

    @Override
    public void speak() {
        System.out.printf("ヒヒーン\n");
    }


}
