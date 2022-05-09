public class Object_ouyou4_0506 {

    public static void main(String[] args) throws Exception {
        Test testA = new Test("鈴木太郎",80, 90, 66);
        Test testB = new Test("山田和夫",70, 50, 40);
        Test testC = new Test("佐藤花子",55, 77, 90);
        Test testD = new Test("近藤由美",66, 45, 38);
        Test testE = new Test("ヘンリー",100, 96, 98);
        Test testF = new Test("北野優衣",35, 65, 48);

        Test5 testAA = new Test5("鈴木太郎", 80, 90, 66, 80, 90);
        Test5 testBB = new Test5("山田和夫", 70, 50, 40, 70, 50);

        //配列にcarを格納
        Test[] testTeam = new Test[6];
        testTeam[0] = testA;
        testTeam[1] = testB;
        testTeam[2] = testC;
        testTeam[3] = testD;
        testTeam[4] = testE;
        testTeam[5] = testF;

        Test5[] testTeam2 = new Test5[2];
        testTeam2[0] = testAA;
        testTeam2[1] = testBB;

        int japanese_sum = 0;
        double englise_sum = 0;
        int top = 0;
        String name = "";

        //1
        for(int i = 0; i <= 5; i++) {
            System.out.println("1." + testTeam[i].getName() + "の合計点は" + testTeam[i].getSum());
            System.out.println("1." + testTeam[i].getName() + "の平均点は" + testTeam[i].getAverage());
        }

        //2
        for (int i = 0; i <= 5; i++) {
            japanese_sum += testTeam[i].getJapanese();
        }
        System.out.println("2.全生徒の国語の合計点は" + japanese_sum + "です");
        japanese_sum = 0;

        //3
        for (int i = 0; i < 6; i++) {
            if(testTeam[i].getMath() > top){
                top = testTeam[i].getMath();
                name = testTeam[i].getName();
            }
        }
        System.out.println("3.数学の最高点は" + top + name);

        //4
        if(testTeam[2].getSum() > testTeam[3].getSum()){
            System.out.println("4.合計点が高いのは" + testTeam[2].getName() + "です");
        }else{
            System.out.println("4.合計点が高いのは" + testTeam[3].getName() + "です");
        }

        //5
        int i = 0;
        for (i = 0; i <= 5; i++) {
            englise_sum += testTeam[i].getEnglish();
        }
        System.out.println("5.全生徒の英語の平均点は%fです" + String.format("%.2f",englise_sum / (i + 1))  + "です");
        englise_sum = 0;

        //6
        testTeam[5].setEnglish(100);
        System.out.println("6." + testTeam[5].getEnglish());

        //7
        i = 0;
        for (i = 0; i <= 5; i++) {
            englise_sum += testTeam[i].getEnglish();
        }
        System.out.println("7.全生徒の英語の平均点は" + String.format("%.2f", englise_sum / (i + 1)) + "です");
        englise_sum = 0;

        //1
        System.out.println("1." + testAA.getSum2() + "です");

    }

}
