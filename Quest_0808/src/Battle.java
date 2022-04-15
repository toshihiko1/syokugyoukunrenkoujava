import java.util.Random;

public class Battle {

    //プロパティ
    private int hp;
    private int mp;
    private String name;
    private Majic majic = null;

    //コンストラクタ
    public Battle(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    //アクセサメソッド　set
    public void setHp(int hp) {
        if (hp <= 1000) {
            this.hp = hp;
        }

        if(hp <= 0) {
            this.hp = 0;
            System.out.printf("%sは死んだ。。。",name);
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

    //アクセサメソッド　get
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

    //attack
    

    //escape

    // damageメソッド
    public void damege() {
        Random rand = new Random();
        int damage = rand.nextInt(100);
        this.hp = this.hp - damage;
        System.out.printf("%sは%dのダメージを受けた\n", name, damage);

    }

    //damage

    //isDead

    //hasMajic

    //isMajic

    //statusメソッド
    public void status() {
        System.out.printf("名前:%s\tHP:%d\tMP:%d\n",name,hp,mp);
    }

    //callMajic

    //callMajic





}
