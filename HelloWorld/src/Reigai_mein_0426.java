import java.util.ArrayList;
import java.util.List;

public class Reigai_mein_0426 {
    public static void main(String[] args) throws Exception {
        // String str = null;
        // try {
        //     int len = str.length();
        // } catch (NullPointerException e) {
        //     System.out.println("NullpointerExceptionが発生しました");
        //     e.printStackTrace();
        // } finally {
        //     System.out.println("finallyブロックです");
        // }

        // 練習問題
        // 1
        List<String> animals = new ArrayList<String>() {
            {
                add("Cat");
                add("Tiger");
                add("Lion");
                add("Leppard");
            }
        };

        // 2,3,4,5
        try{
            System.out.println(animals.get(1));
            System.out.println(animals.get(4));
        } catch (Exception e) {
            System.out.println("エラー：配列の要素に文字が定義されていません");
        } finally {
            System.out.println("処理終了");
        }

        // 6
        String aisatsu = "Hello!!!";

        int start_index = 2;
        int end_index = 4;

        // 7
        System.out.println(aisatsu.substring(start_index, end_index));

        // 8,9,10,11
        try{
            String bikkuri = aisatsu.substring(7,8);
            if(bikkuri.equals("!")){
            // アドレス同士を == で比較するとfalseになる。
            // アドレスが異なる場合はequalsで文字そのもののアドレスを比較している。
                System.out.println("ビックリマークです");
            }
            bikkuri = aisatsu.substring(8, 9);
            if(bikkuri.equals("!")){
                System.out.println("ビックリマークです");
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException：配列の要素に文字が定義されていません");
        }finally{
            System.out.println("処理終了");
        }
    }
}
