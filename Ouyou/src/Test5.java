public class Test5 extends Test {
    private int science;
    private int society;

    public Test5(String name, int japanese, int english, int math, int science, int society) {
        super(name,japanese,english,math);
        this.science = science;
        this.society = society;
    }

    public int getSum2() {
        return (science + society);
    }

    // アクセサメソッド get
    public int getScience() {
        return science;
    }
    public int getSociety() {
        return society;
    }

    @Override
    public int getSum() {
        super.getSum();
        return (getSum() + getSum2());
    }
    // アクセサメソッド　set
    // public void setEnglish(int english) {
    //     this.english = english;
    // }



}
