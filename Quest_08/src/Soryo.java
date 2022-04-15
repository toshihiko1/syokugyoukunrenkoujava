public class Soryo extends Hero {

    // コンストラクタ
    public Soryo(String name, int hp, int mp) {
        super(name, hp, mp);
        // Majicクラスのコンストラクタからインスタンスhoimiを生成
        Majic hoimi = new Majic("ホイミ", 5, true);
        // Battleクラスのmajicプロパティにhoimiを代入
        setMajic(hoimi);
    }

    // メソッド callMagic オーバーライド
    // callMajicの戻り値がtrueならメラで10のダメージ
    @Override
    public boolean callMajic(Battle target) {
        if (super.callMajic(target)) {
            target.setHp(target.getHp() + 10);
            System.out.printf("%sのHPが10回復した。\n",target.getName());
            target.status();
            return true;
        }
            return false;
    }

}
