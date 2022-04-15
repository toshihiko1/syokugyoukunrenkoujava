public class MetalSlime extends Slime {

    // コンストラクタ
    public MetalSlime(String name, int hp, int mp) {
        super(name, hp, mp);
        // Majicクラスのコンストラクタからインスタンスhoimiを生成
        Majic mela = new Majic("メラ", 5, true);
        // Battleクラスのmajicプロパティにhoimiを代入
        setMajic(mela);
    }

    // メソッド callMagic オーバーライド
    // callMajicの戻り値がtrueならメラで10のダメージ
    @Override
    public boolean callMajic(Battle target) {
        if (super.callMajic(target)) {
            target.damage(10);
            return true;
        }
            return false;
    }

}
