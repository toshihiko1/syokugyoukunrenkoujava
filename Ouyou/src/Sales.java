public class Sales {
    private String name;
    private int price;
    private int number;
    private boolean over30;

    public Sales(String name, int price, int number, boolean over30) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.over30 = over30;
    }


    public double getWaribiki() {
        return 0.3;
    }

    public int getSalsePrice(boolean yn) {
        if(yn == true) {
            return (int) (this.price * this.number * (1 - getWaribiki()));
        }else {
            return (int) (this.price * this.number);
        }

    }

    // アクセサメソッド get
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public boolean getOver30() {
        return over30;
    }


}
