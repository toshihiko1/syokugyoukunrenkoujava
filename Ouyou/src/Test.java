public class Test {
    private String name;
    private int japanese;
    private int english;
    private int math;

    public Test(String name, int japanese, int english, int math) {
        this.name = name;
        this.japanese = japanese;
        this.english = english;
        this.math = math;
    }

    public int getSum() {
        return (japanese + english + math);
    }

    public double getAverage() {
        return ((japanese + english + math) / 3);
    }


    // アクセサメソッド get
    public String getName() {
        return name;
    }

    public int getJapanese() {
        return japanese;
    }

    public double getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    // アクセサメソッド　set
    public void setEnglish(int english) {
        this.english = english;
    }



}
