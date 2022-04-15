import java.util.Random;
public class Quest {
    public static void main(String[] args) throws Exception {

        // スライムのインスタンス生成
        Slime slimeA = new Slime("スライムA", 100, 100);
        slimeA.status();
        // slimeA.damage();
        // slimeA.status();

        // ホイミスライムのインスタンス生成
        HoimiSlime slimeB = new HoimiSlime("ホイミスライム", 120, 120);
        slimeB.status();
        // if(slimeB.callMajic()) {
        //     slimeB.status();
        // }

        // メタルスライムのインスタンス生成
        MetalSlime slimeC = new MetalSlime("メタルスライム", 499, 499);
        slimeC.status();
        // if(slimeC.callMajic(slimeB)) {
        //     slimeC.status();
        //     slimeB.status();
        // }

        // ベホマスライムのインスタンス生成
        BehomaSlime slimeD = new BehomaSlime("ベホマスライム", 200, 150);
        slimeD.status();
        // if (slimeD.callMajic()) {
        //     slimeD.status();
        // }

        // 勇者のインスタンス生成
        Hero hero = new Hero("勇者", 30, 600);
        hero.status();
        // slimeA.damage();
        // slimeA.status();

        // 僧侶のインスタンス生成
        Soryo soryo = new Soryo("僧侶", 120, 120);
        soryo.status();
        // if (soryo.callMajic(hero)) {
        // soryo.status();
        // }

        /********************************************/

        // 配列にスライムを格納
        Slime[] slimeTeam = new Slime[4];
        slimeTeam[0] = slimeA;
        slimeTeam[1] = slimeB;
        slimeTeam[2] = slimeC;
        slimeTeam[3] = slimeD;

        /********************************************/

        // ランダムのインスタンス生成
        Random rand = new Random();

        while(true) {
            System.out.printf("******************************************\n");
            // 勇者の攻撃
            int opp = rand.nextInt(4);
            hero.attack(slimeTeam[opp]);

        // スライムの攻撃
        if(!slimeTeam[opp].isDead()) {
            if(slimeTeam[opp].hasMajic()) {
                if(slimeTeam[opp].getMajic().isTarget_exist()) {
                    slimeTeam[opp].callMajic(hero);
                }else{
                    slimeTeam[opp].callMajic();

                }
            }else{
                slimeTeam[opp].attack(hero);
            }
        }

        // 勇者のHPが30以下なら僧侶の回復
        if(hero.getHp() < 30) {
            soryo.callMajic(hero);
        }

        // 勇者のHPが10以下なら僧侶の回復
        if(hero.getHp() < 10) {
            hero.escape();
            break;
        }

        // 勇者と対戦相手のステータス
        hero.status();
        slimeTeam[opp].status();

        if(hero.getHp() == 0 || slimeTeam[opp].getHp() == 0) {
            break;
        }

        }
        System.out.printf("******************************************\n");

        /********************************************/
    }
}
