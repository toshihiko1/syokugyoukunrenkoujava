public class HoimiSlime extends Slime {

    // コンストラクタ
    public HoimiSlime(String name, int hp, int mp) {
        super(name, hp, mp);
    // Majicクラスのコンストラクタからインスタンスhoimiを生成
        Majic hoimi = new Majic("ホイミ", 5, false);
    // Battleクラスのmajicプロパティにhoimiを代入
        setMajic(hoimi);
    }

    // メソッド callMagic オーバーライド
    // callMajicの戻り値がtrueならHPに10を足す
    @Override
    public boolean callMajic() {
        if(true) {
            setHp((getHp() + 10));
        }
        return super.callMajic();
    }

    // Majic hoimi = new Majic(name, mp, false);
    //     hoimi.setName("ホイミ");
    //     hoimi.setMp(5);
    //     hoimi.isTarget_exist();


}
