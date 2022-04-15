public class Product_main {
    public static void main(String[] args) throws Exception {
        Product product_main = new Product();
        // 値の代入
        product_main.setPrice(1000);
        product_main.setDisRate(20);
        // 割引をする関数の呼び出し
        int afprice = product_main.getSellingPrice();
        // 値の出力
        System.out.printf("商品 価格＝%d 割引率＝%d％ 割引後価格＝%d\n",
                product_main.getPrice(), product_main.getDisRate(), afprice);
    }
}
