public class BehomaSlime extends Slime {

    // コンストラクタ
    public BehomaSlime(String name, int hp, int mp) {
        super(name, hp, mp);
        // Majicクラスのコンストラクタからインスタンスhoimiを生成
        Majic behoma = new Majic("ベホマ", 20, false);
        // Battleクラスのmajicプロパティにhoimiを代入
        setMajic(behoma);
    }

    // メソッド callMagic オーバーライド
    // callMajicの戻り値がtrueなら30回復
    @Override
    public boolean callMajic() {
        if (true) {
            setHp((getHp() + 30));
        }
        return super.callMajic();
    }

}
