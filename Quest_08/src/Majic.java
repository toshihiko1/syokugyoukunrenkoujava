public class Majic {

    //プロパティ
    private String name; //呪文の名前
    private int mp; //必要マジックポイント
    private boolean target_exist; //唱える相手の有無

    //コンストラクタ
    public Majic(String name, int mp, boolean target_exist) {
        this.name = name;
        this.mp = mp;
        this.target_exist = target_exist;
    }

    //メソッド　set 引数でMajicクラスのプロパティに値を代入
    public void setName(String name) {
        this.name = name;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setTarget_exist(boolean target_exist) {
        this.target_exist = target_exist;
    }

    //メソッド　get プロパティの値を返す
    public String getName() {
        return name;
    }

    public int getMp() {
        return mp;
    }

    public boolean isTarget_exist() {
        return target_exist;
    }



}
