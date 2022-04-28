import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Rensyu_0426 {
    public static void main(String[] args) throws Exception {
        // // 練習問題２
        // List<Double> aryNum = new ArrayList<Double>(){
        //     {
        //         add(5D);
        //         add(185.3);
        //         add(120.6);
        //         add(148.0);
        //         add(176.4);
        //     }
        // };
        // System.out.printf("練習問題(初期化):%s\n", aryNum);

        // // 1
        // if (aryNum.contains(5D)) {
        // System.out.printf("1:含まれています\n");
        // } else {
        // System.out.printf("1:含まれていません\n");
        // }

        // // 2
        // Collections.sort(aryNum, Comparator.reverseOrder());
        // System.out.printf("2:%s\n",aryNum);

        // // 3
        // System.out.printf("3:%s\n", aryNum.get(aryNum.size() - 1));

        // // 4
        // System.out.printf("4:%s\n", aryNum.get(0));

        /********************************************/
        // 練習問題3
        // 1
        List<String> fruits = new ArrayList<String>() {
            {
                add("Orange");
                add("Apple");
                add("Banana");
            }
        };

        // 2
        // indexOf
        fruits.set(0,"Grape");

            System.out.printf("%s\n",fruits);

        // 3
        fruits.add(2,"Kiwi");
        for (String all_fruits : fruits) {
            System.out.printf("%s", all_fruits);
        }

        System.out.printf("\n");

        // 4
        fruits.remove(3);
        System.out.printf("%s\n", fruits);

        // 5
        String hokan = fruits.get(0);
        String hokan2 = fruits.get(2);
        fruits.set(0, hokan2);
        fruits.set(2, hokan);
        System.out.printf("%s\n", fruits);

        // 6
        int ary_count = fruits.size();
        System.out.printf("%d\n", ary_count);

        // 7
        if(fruits.contains("Orange")) {
            System.out.printf("含まれています\n");
        }else{
            System.out.printf("含まれていません\n");
        }

        // 8
        Collections.sort(fruits);
        System.out.printf("%s\n", fruits);

        /********************************************/
    }
}
