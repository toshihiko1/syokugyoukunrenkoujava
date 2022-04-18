public class Mojiretsu_main {
    public static void main(String[] args) throws Exception {
        // String str = "Hello";
        // System.out.printf("strの長さ=%d\n", str.length());

        // if (str.equals("Hello")) {
        //     System.out.printf("Helloと同じ\n");
        // } else {
        //     System.out.printf("Helloと異なる\n");
        // }

        // String s = "World!";
        // System.out.printf("%s\n", str + s);

        // System.out.printf("%s\n", str.substring(2, 5));

        // boolean(String).startsWith(String s);
        // if (str.startsWith("lo")) {
        //     System.out.printf("loから始まる文字列\n");
        // } else {
        //     System.out.printf("loから始まらない文字列\n");
        // }

        // if (str.indexOf("ll") >= 0) {
        //     System.out.printf("指定した文字列は見つかりました。\n");
        // } else {
        //     System.out.printf("指定した文字列は見つかりませんでした。\n");
        // }

        /*********************************************************/
        // 1 str1にライフスキルを代入
        // String str1 = "ライフスキル";

        // 2 str1の表示
        // System.out.printf("%s\n", str1);

        // 3 str1にアカデミーを追加
        // str1 = str1 + "アカデミー";
        // System.out.printf("%s\n", str1);

        // 4 ライフスキルアカデミーに空白を追加
        // String str2 = str1.substring(0, 6);
        // String str3 = str1.substring(6, 11);
        // String str4 = str2 + ' ' + str3;
        // System.out.printf("%s\n", str4);

        // 5 str4の文字列の長さを表示
        // System.out.printf("str4の長さ=%d\n", str4.length());

        // 6 str2に2016を代入
        // str2 = "2016";

        // 7 0702をstr2に連結
        // str2 += "0702";
        // System.out.printf("%s\n", str2);

        // 8 str1とstr2が同じ文字列かの確認
        // if (str1.equals(str2)) {
        //     System.out.printf("str1とstr2は同じ文字列\n");
        // } else {
        //     System.out.printf("str1とstr2は異なる文字列\n");
        // }

        // 9 str1とstr2を連結しstr3に代入
        // str3 = str1 + str2;
        // System.out.printf("%s\n", str3);

        // 10 str3の2文字目から4文字目までを表示
        // System.out.printf("%s\n", str3.substring(1, 5));

        // 11 str3に文字列アカが含まれているか確認
        // if (str3.indexOf("アカ") >= 0) {
        //     System.out.printf("指定した文字列は見つかりました。\n");
        // } else {
        //     System.out.printf("指定した文字列は見つかりませんでした。\n");
        // }

        /***************************************************************/

        // StringBuilder sb = new StringBuilder("Hello!!! ");
        // sb.append("World");
        // System.out.printf("%s\n", sb);

        // sb.insert(9, "!!!");
        // System.out.printf("%s\n", sb);

        // sb.delete(5, 12);
        // System.out.printf("%s\n", sb);

        // sb.replace(5, 10, "!!!");
        // System.out.printf("%s\n", sb);

        /***************************************************************/
        // 1
        // StringBuilder sb1 = new StringBuilder("今日は");

        // 2
        // sb1.append("天気いいですね。");
        // System.out.printf("%s\n", sb1);

        // 3
        // String repstr = "いい";
        // int startIndex = sb1.indexOf(repstr);
        // int endIndex = startIndex + repstr.length();
        // sb1.replace(startIndex, endIndex, "悪い");
        // sb1.replace(5, 7, "悪い");
        // System.out.printf("%s\n", sb1);

        // 4
        // StringBuilder sb2 = new StringBuilder("運動会なのに");

        // 5
        // StringBuilder sb3 = sb2.append(sb1);
        // System.out.printf("%s\n", sb3);

        // 6
        // sb3.delete(6, 9);
        // System.out.printf("%s\n", sb3);

        // 7
        // System.out.printf("%d\n", sb3.length());

        // 8
        // sb3.append("中止になりそうです。");
        // System.out.printf("%s\n", sb3);

        // 文字列総合問題
        // 1
        StringBuilder strHello = new StringBuilder("Hello ");
        StringBuilder strHello2 = new StringBuilder("Hello ");
        while(true) {
            strHello.append(strHello2);
            if(strHello.length() > 100){
                break;
            }
        }

        System.out.printf("%s\n", strHello);
        System.out.printf("%d\n", strHello.length());

        // 2
        String ll = "ll";
        String lll = "lll";
        String ee = "ee";
        String eee = "eee";
        int startIndex = 0;
        int endIndex = 0;

        while((startIndex = strHello.indexOf(ll)) >= 0) {
        endIndex = startIndex + ll.length();
        strHello.replace(startIndex, endIndex, "ee");
        }

        System.out.printf("%s\n", strHello);

        /****************/
        String strHello3 = strHello.toString();
        strHello3 = strHello3.replaceAll(eee, lll);
        System.out.printf("%s\n", strHello3);
        /***************/


        // String ll = "ll";
        // int strHellolength = strHello.length();
        // int startIndex = strHello.indexOf(ll);
        // int endIndex = startIndex + ll.length();

        // while(true) {
        // strHello.replace(startIndex, endIndex, "ee");
        // startIndex += 6;
        // endIndex += 6;
        //     if (startIndex >= strHellolength) {
        //         break;
        //     }
        // }

        // System.out.printf("%s\n", strHello);

    }
}
