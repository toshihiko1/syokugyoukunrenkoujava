public class Rappa_main {
    public static void main(String[] args) throws Exception {

        // 1 文字列に数値を変換（ラッパークラスのクラスメソッド）
        // String str = "120";
        // int a = Integer.parseInt(str);
        // System.out.printf("%d\n",a);
        // float a2 = Float.parseFloat(str);
        // System.out.printf("%f\n", a2);

        // 2 文字列に数値を変換（ラッパークラスのクラスメソッド）
        // Integer b = Integer.valueOf(str);
        // System.out.printf("%d\n", b);
        // Double b2 = Double.valueOf(str);
        // System.out.printf("%f\n", b2);

        // 3 数値を別の数値型に変換
        // Integer x = 100;
        // long y1 = x.longValue();
        // System.out.printf("%d\n", y1);
        // double y2 = x.doubleValue();
        // System.out.printf("%f\n", y2);

        // 4 数字を文字列に変換
        // String s = x.toString();
        // System.out.printf("%s\n", s);

        // 5 他のオブジェクトが同値か比較
        // Integer y = 150;
        // if(x.equals(y)){
        //     System.out.printf("同じ値\n");
        // }else{
        //     System.out.printf("異なる値\n");
        // }

        // 6 他のオブジェクトが数値的に比較
        // if(x.compareTo(y) == 0){
        //     System.out.printf("同じ値\n");
        // }

        // if(x.compareTo(y) < 0) {
        //     System.out.printf("xの方が小さい");
        // }

        // if(x.compareTo(y) > 0) {
        //     System.out.printf("xの方が大きい");
        // }

        // 練習問題

        // 1
        Float num1 = (float)-2.55;

        // 2
        System.out.printf("%d\n", num1.intValue());

        // 3
        System.out.printf("%f\n", num1);

        // 4
        Integer num2 = 12;

        // 5
        System.out.printf("%f\n", num2.floatValue());

        // 6
        if(num1.compareTo(num2.floatValue()) > 0) {
            System.out.printf("%f\n", num1);
        }else if(num1 < num2){
            System.out.printf("%d\n", num2);
        }
    }
}
