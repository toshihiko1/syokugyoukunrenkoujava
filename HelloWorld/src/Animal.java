public class Animal {
    private String name = "";
    private int age = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showProfile() {
        System.out.printf("名前は、%s、%d歳です\n",name,age);
    }
    public void speak() {
        System.out.printf("......");
    }


}

