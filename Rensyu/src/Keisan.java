public class Keisan {
    public static int getValueDouble(int num) {
        // 値を倍にする
        int two_num = num * 2;
        return two_num;
    }

	public static float getValueHalf(int num) {
		// 値を半分にする
		float half_num = (float) num / 2;
		return half_num;
	}

	public static boolean isEven(int num) {
		return (num % 2 == 0);
	}
}
