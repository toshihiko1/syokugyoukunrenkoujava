public class Object_ouyou1_0502 {
    public static void main(String[] args) throws Exception {
        Car carA = new Car("カローラ", 4,9.5,2000);
        Car carB = new Car("フリード", 6,6.2,2800);
        Car carC = new Car("ミゼット", 2,14.8,660);
        Car carD = new Car("アルファード", 8,4.5,3000);

        // 配列にcarを格納
        Car[] carTeam = new Car[4];
        carTeam[0] = carA;
        carTeam[1] = carB;
        carTeam[2] = carC;
        carTeam[3] = carD;

        System.out.println("車のタイヤは" + carA.getTireNum() + "本です");
        System.out.println(carA.getName() + "は" + carA.getKlass() + "クラスです");
        System.out.println(carB.getName() + "は" + carB.getKlass() + "クラスです");
        System.out.println(carC.getName() + "は" + carC.getKlass() + "クラスです");
        System.out.println(carD.getName() + "は" + carD.getKlass() + "クラスです");

        System.out.printf("4人乗れる車は\n");
        for(int i = 0; i < 4; i++) {
            if(carTeam[i].canRide(4)) {
                System.out.println(carTeam[i].getName());
            }
        }

        System.out.printf("100km走るのに必要なガソリン量は\n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s%.4f\n",carTeam[i].getName() , carTeam[i].getRunDistance(100));
        }
    }
}
