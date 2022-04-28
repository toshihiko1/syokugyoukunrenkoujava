import java.util.HashMap;
import java.util.Map;

public class Map_main {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map1 = new HashMap<Integer, String>(){
            {
                put(1,"やま");
                put(3,"まさと");
                put(4,"しーちゃん");
                put(5,"たく");
                put(6,"かいと");
            }
        };
        System.out.println("map1=" + map1);

        System.out.println("３番は" + map1.get(3) + "です");

        int key_num = 2;
        if(map1.containsKey(key_num)) {
            System.out.println(key_num +"番はいます");
        }else{
            System.out.println(key_num + "番はいません");
        }

        for(Map.Entry<Integer,String> data: map1.entrySet()) {
                System.out.println(data.getKey()+ data.getValue());
            }

        Map<Integer, String> fruits = new HashMap<Integer, String>() {
            {
                put(1, "りんご");
                put(2, "みかん");
                put(3, "なし");
                put(4, "すいか");
                put(5, "マンゴー");
            }
        };
        int fruits_num = 3;

        System.out.println(fruits_num + "番は" + fruits.get(3));
    }
}
