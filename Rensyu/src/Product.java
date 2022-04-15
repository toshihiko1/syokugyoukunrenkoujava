public class Product {

  private int price;
  private int disRate;

  public int getSellingPrice(int price) {
    int afprice = 0;
    // 割引後の価格を求める
    afprice = price * 8 / 10;
    return afprice;
  }

  // public int getSellingPrice() {
  //   return 0;
  // }

  public int getPrice() {
    return price;
  }

  public int getDisRate() {
    return disRate;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setDisRate(int disRate) {
    this.disRate = disRate;
  }

}
