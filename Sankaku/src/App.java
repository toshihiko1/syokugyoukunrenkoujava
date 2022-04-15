import color.Color;
import sankaku.proc.Sankaku;

public class App {
    public static void main(String[] args) throws Exception {

        int side = Sankaku.numSide();
        System.out.printf("side=%d\n",side);

        /********************************************/
        //インスタンスA生成
        Sankaku sankaku_A = new Sankaku();
        //値の代入
        //sankaku_A.teihen = 6;
        sankaku_A.setTeihen(6);
        //sankaku_A.takasa = 4;
        sankaku_A.setTakasa(4);
        //値の出力
        System.out.printf("三角A 底辺＝%d 高さ＝%d\n",
            sankaku_A.getTeihen(),sankaku_A.getTakasa());
        //メソッド呼び出し
        float menseki = sankaku_A.getMenseki();
        System.out.printf("三角A 面積＝%f\n",menseki);
        //メソッドsizeBiggerの呼び出し
        sankaku_A.sizeBigger(2,3);
        // 値の出力
        System.out.printf("三角A 底辺＝%d 高さ＝%d\n",
                sankaku_A.getTeihen(), sankaku_A.getTakasa());

        /********************************************/
        //インスタンスB生成
        Sankaku sankaku_B = new Sankaku();
        //値の代入
        //sankaku_B.teihen = 7;
        sankaku_B.setTeihen(7);
        //sankaku_B.takasa = 5;
        sankaku_B.setTeihen(5);
        //値の出力
        System.out.printf("三角B 底辺＝%d 高さ＝%d\n",
            sankaku_B.getTeihen(), sankaku_B.getTakasa());
        // メソッド呼び出し
        menseki = sankaku_B.getMenseki();
        System.out.printf("三角B 面積＝%f\n", menseki);
        // メソッドsizeBiggerの呼び出し
        sankaku_B.sizeBigger(2, 3);
        // 値の出力
        System.out.printf("三角B 底辺＝%d 高さ＝%d\n",
                sankaku_B.getTeihen(), sankaku_B.getTakasa());

        /********************************************/
        //インスタンスC生成
        Sankaku sankaku_C = new Sankaku();
        //値の代入
        //sankaku_C.teihen = 10;
        sankaku_C.setTeihen(10);
        //sankaku_C.takasa = 3;
        sankaku_C.setTakasa(3);
        //値の出力
        System.out.printf("三角C 底辺＝%d 高さ＝%d\n",
            sankaku_C.getTeihen(),sankaku_C.getTakasa());
        // メソッド呼び出し
        menseki = sankaku_C.getMenseki();
        System.out.printf("三角C 面積＝%f\n", menseki);
        // メソッドsizeBiggerの呼び出し
        sankaku_C.sizeBigger(2, 3);
        // 値の出力
        System.out.printf("三角C 底辺＝%d 高さ＝%d\n",
                sankaku_C.getTeihen(), sankaku_C.getTakasa());
        /********************************************/
        //インスタンスD生成
        Sankaku sankaku_D = new Sankaku(2,4);
        menseki = sankaku_D.getMenseki();
        //値の出力
        System.out.printf("三角D 底辺＝%d 高さ＝%d 面積＝%f\n",
            sankaku_D.getTeihen(),sankaku_D.getTakasa(),menseki);
        /********************************************/

        //クラスの応用(継承)
        sankaku_A.setIro("赤");
        System.out.printf("三角A 色=%s", sankaku_A.getIro());

        // Colorクラスのインスタンス生成
        Color cl_A = new Color();
        cl_A.setRed(0);
        cl_A.setGreen(1);
        cl_A.setBlue(2);
        sankaku_A.setCl(cl_A);

        System.out.printf("三角形のカラーはRED:%d, GREEN:%d, BLUE:%d\n",
            sankaku_A.getCl().getRed(),
            sankaku_A.getCl().getGreen(),
            sankaku_A.getCl().getBlue());

    }
}
