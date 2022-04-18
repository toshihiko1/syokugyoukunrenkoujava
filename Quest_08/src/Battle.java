import java.util.Random;

public class Battle {

    //プロパティ
    private int hp;
    private int mp;
    private String name;
    private Majic majic = null;

    //コンストラクタ
    /**
     * コンストラクタ
     * @param name 名前
     * @param hp 体力
     * @param mp マジックポイント
     */
    public Battle(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    // メソッド
    /********************************************/

    //attack
    public void attack(Battle target) {
        if(isDead()) {
        }else{
            System.out.printf("%sは%sに攻撃した\n",getName(),target.getName());
            target.damage();
        }
    }

    //escape
    public void escape() {
        System.out.printf("%sは逃げ出した",getName());
    }

    // damageメソッド
    // 処理
    // 0から99の乱数を発生させる
    // 「nameは乱数のダメージを受けた」と表示
    //　hpから乱数を引く
    public void damage() {
        Random rand = new Random();
        int damage = rand.nextInt(100);
        System.out.printf("%sは%dのダメージを受けた\n", name, damage);
        setHp(getHp() - damage);

    }

    //damage
    public void damage(int iryoku) {
        System.out.printf("%sは%dのダメージを受けた\n", getName(), iryoku);
        setHp(getHp() - iryoku);
    }

    //isDead
    // 戻り値:boolean [true]死亡 [false]生存
    public boolean isDead() {
        return (this.hp <= 0);
    }

    //hasMajic
    // 戻り値:boolean [true]呪文あり [false]呪文なし
    // 処理:majic(マジック情報)がnullであればfalseを、nullでなければtrueを返す
    public boolean hasMajic() {
        return (this.majic != null);
    }

    //isMajic
    // 戻り値:boolean [true]成功 [false]失敗
    // 処理
    // 「nameはmajicnameを唱えたと」表示
    // mpが必要MP数以上の場合はtrueを返し、それ以外の場合は「しかし、Mpが足らなかった・・・」とfalseを返す
    public boolean isMajic() {
        System.out.printf("%sは%sを唱えた\n",this.name,majic.getName());
        if(this.mp >= majic.getMp()){
            return true;
        }else{
            System.out.printf("しかし、MPが足りなかった・・・\n");
            return false;
        }
    }

    //statusメソッド
    // 処理:名前、HP、MPを表示
    public void status() {
        System.out.printf("名前:%s\tHP:%d\tMP:%d\n",name,hp,mp);
    }

    //callMajic
    // 戻り値:boolean [true]成功 [false]失敗
    // 処理
    // isDeadがtrueの場合はfalseを返して処理終了
    // マジック情報がnullの場合はfalseを返して処理終了(hasMajicを使用する)
    // isMajicメソッドの戻り値がtrueの場合、mpから必要MP数を減算する
    // isMajicの戻り値を戻り値として返す
    public boolean callMajic() {
        if(isDead() || !hasMajic()) {
            return false;
        }else{
            boolean jadge = isMajic();
            if(jadge == true) {
                setMp(this.mp - majic.getMp());
            }
                return jadge;
            }
        }

    //callMajic
    public boolean callMajic(Battle target) {
        return callMajic();
    }

    /********************************************/

    // アクセサメソッド set
    public void setHp(int hp) {
        if (hp <= 1000) {
            this.hp = hp;
        }

        if (hp <= 0) {
            this.hp = 0;
            System.out.printf("%sは死んだ。。。\n", name);
        }
    }

    public void setMp(int mp) {
        if (mp <= 1000) {
            this.mp = mp;
        }

        if (mp <= 0) {
            this.hp = 0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajic(Majic majic) {
        this.majic = majic;
    }

    /********************************************/

    // アクセサメソッド get
    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public String getName() {
        return name;
    }

    public Majic getMajic() {
        return majic;
    }

    /********************************************/


}
