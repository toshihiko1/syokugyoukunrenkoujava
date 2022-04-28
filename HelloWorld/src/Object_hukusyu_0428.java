import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Object_hukusyu_0428 {
    private static void kuku(int i) {
        int a;
        int y = 1;
        while (true) {
            a = i * y;
            System.out.println(i + "X" + y + "=" + a);
            y++;
            if (y == 10) {
                break;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        /***************************************/
        System.out.println("Lifeskill Academy");

        /***************************************/

        int x = 11;
        System.out.println("x=" + x);

        /***************************************/

        x = 13;
        int y = 17;

        System.out.println("x=" + x + ",y=" + y);

        /***************************************/

        x = x + y;
        System.out.println("x=" + x);

        /***************************************/

        x = 7;
        x *= 3;
        System.out.println("x=" + x);
        x /= 2;
        System.out.println("x=" + x);

        /***************************************/

        String str = "abc";
        System.out.println("str=" + str);

        /***************************************/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("整数値を入力 ->");
        str = br.readLine();
        // System.out.printf("\n");
        x = Integer.parseInt(str);
        System.out.printf("終了");
        System.out.printf("\n");

        /***************************************/

        System.out.printf("整数値を入力 ->");
        str = br.readLine();
        x = Integer.parseInt(str);
        System.out.printf("整数値を入力 ->");
        str = br.readLine();
        y = Integer.parseInt(str);

        x += y;
        System.out.println("２つの値の和=" + x);
        x -= y;
        System.out.println("２つの値の差=" + x);
        x *= y;
        System.out.println("２つの値の積=" + x);
        x /= y;
        System.out.println("２つの値の商=" + x);
        x %= y;
        System.out.println("２つの値の余=" + x);

        /***************************************/
        System.out.printf("整数値を入力 ->");
        str = br.readLine();
        x = Integer.parseInt(str);
        System.out.printf("整数値を入力 ->");
        str = br.readLine();
        y = Integer.parseInt(str);

        if(x > y) {
            System.out.println("xはyより大きい");
        }else{
            System.out.println("xはyより小さい");
        }
        /***************************************/
        System.out.printf("正の整数値を入力 ->");
        str = br.readLine();
        x = Integer.parseInt(str);
        x %= 2;
        if(x == 0) {
            System.out.println("xは偶数");
        }else{
            System.out.println("xは奇数");
        }
        /***************************************/
        System.out.printf("点数を入力 ->");
        str = br.readLine();
        x = Integer.parseInt(str);
        if(x < 0 || x > 100) {
            System.out.println("入力値不正:点数は0〜100の数値で入力してください。");
        }else if(x >= 80){
            System.out.println("80点以上:たいへんよくできました。");
        } else if (x >= 60) {
            System.out.println("60点以上:よくできました。");
        } else {
            System.out.println("60点未満:ざんねんでした。");
        }
        /***************************************/
        int a;
        x = 1;
        y = 1;
        while(true) {
            while(true) {
                a = x * y;
                System.out.println(x + "X" + y + "=" + a);
                y++;
                if(y == 10){
                    break;
                }
            }
            y = 1;
            x++;
            if(x == 10) {
                break;
            }
        }
        /***************************************/
        List<String>num = new ArrayList<String>();
        for(int i = 0; i <= 9; i++) {
        System.out.printf("整数を入力 ->");
        str = br.readLine();
        num.add(str);
        }
        Collections.sort(num);
        System.out.println(num);

        System.out.println("最小値=" + num.get(0));

        x = num.size();

        System.out.println("最大値=" + num.get(x-1));

        /***************************************/

        kuku(2);
    }

}
