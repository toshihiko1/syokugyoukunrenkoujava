public class Dog {
    private String name = "";
    private int age;
    private String syurui;

    public Dog(String syurui){
        this.syurui = syurui;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSyurui(String syurui) {
        this.syurui = syurui;
    }

    public void showProfile() {
        System.out.printf("名前は、%sです\n",name);
        System.out.printf("年齢は、%dです\n",age);
        System.out.printf("犬種は、%sです\n",syurui);
    }


}
