public class Keisan_main {
    public static void main(String[] args) throws Exception {

		/* 1 ****************************************/
        // 値を倍にする関数の呼び出し
        int twonum = Keisan.getValueDouble(88);
        // 値の出力
        System.out.printf("%d\n",twonum);

		/* 2 ****************************************/
        // 値を倍にする関数の呼び出し
        float halfnum = Keisan.getValueHalf(55);
        // 値の出力
        System.out.printf("%.1f\n",halfnum);

		/* 3 ****************************************/
		// twonumとhalfを足す
        twonum = Keisan.getValueDouble(34);
        halfnum = Keisan.getValueHalf(17);
		// float two_half_num = twonum + halfnum;
		System.out.printf("%.1f\n", twonum + halfnum);

		/* 4 ****************************************/
		// 引数が偶数か奇数かを求める
		boolean judge = Keisan.isEven(17);
		if(judge) {
			System.out.printf("値は偶数\n");
		}else{
			System.out.printf("値は奇数\n");
		}

		/* 5 ****************************************/
		// 引数が偶数か奇数かを求める
		boolean judge2 = Keisan.isEven(2444);
		if(judge2) {
			System.out.printf("値は偶数\n");
		}else{
			System.out.printf("値は奇数\n");
		}

		/********************************************/
    }
}
