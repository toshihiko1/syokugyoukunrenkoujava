public class Car {
    private String name;
    private int capacity;
    private double fuel;
    private int cc;

    public Car(String name, int capacity, double fuel, int cc) {
        this.name = name;
        this.capacity = capacity;
        this.fuel = fuel;
        this.cc = cc;
    }

    public int getTireNum() {
        return 4;
    }

    public String getKlass() {
        if(this.cc >= 2500) {
            return "L";
        }else if(this.cc >= 2000) {
            return "M";
        }else {
            return "S";
        }
    }

    public boolean canRide(int capacity) {
        if(this.capacity >= capacity){
            return true;
        }else{
            return false;
        }

    }

    public double getRunDistance(int kyori) {
        double liter = (kyori / this.fuel);
        return liter;
    }

    // アクセサメソッド get
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFuel() {
        return fuel;
    }

    public int getCc() {
        return cc;
    }


}
