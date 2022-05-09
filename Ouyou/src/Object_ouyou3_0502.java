public class Object_ouyou3_0502 {


    public static int getCapacity() {
        return 40;
    }

    public static void main(String[] args) throws Exception {
        Room roomA = new Room(1,"A", 30);
        Room roomB = new Room(1,"B", 40);
        Room roomC = new Room(2,"A", 40);
        Room roomD = new Room(2,"B", 38);
        Room roomE = new Room(3,"A", 28);
        Room roomF = new Room(3,"B", 30);

        //配列にcarを格納
        Room[] roomTeam = new Room[6];
        roomTeam[0] = roomA;
        roomTeam[1] = roomB;
        roomTeam[2] = roomC;
        roomTeam[3] = roomD;
        roomTeam[4] = roomE;
        roomTeam[5] = roomF;

        //1
        System.out.println("1.教室の定員は" + Object_ouyou3_0502.getCapacity());
        int sum = 0;
        int grade = 0;

        //2
        for (int i = 0; i < 6; i++) {
            grade = roomTeam[i].getGrade();
            if(grade == 1) {
                sum += roomTeam[i].getNumber();
            }
        }
        System.out.println("2.1年生の在籍人数は" + sum);
        sum = 0;

        //3
        for (int i = 0; i < 6; i++) {
            if(roomTeam[i].isFullClass()){
                System.out.println("3.満員の教室は" + roomTeam[i].getGrade() + "年" + roomTeam[i].getKlass() + "組");
            }
        }

        //4
        for (int i = 0; i < 6; i++) {
            sum += roomTeam[i].getNumber();
        }
        System.out.println("4.全生徒の人数は" + sum + "人です");
        sum = 0;

        //5
        System.out.println("5.3年B組の人数は" + roomF.number);
        roomF.number = (roomF.getNumber() - 3);
        System.out.println("5.3年B組の人数は" + roomF.number);

        //6
        for (int i = 0; i < 6; i++) {
            sum += roomTeam[i].getNumber();
        }
        System.out.println("6.全生徒の人数は" + sum + "人です");

        System.out.println("7.1年A組の人数は" + roomA.number + "人です");
        System.out.println("7.1年B組の人数は" + roomB.number + "人です");

        //7
        if(roomA.number < roomB.number) {
            roomA.number += 7;
        }else if(roomA.number > roomB.number) {
            roomB.number += 7;
        }

        //8
        System.out.println("8.1年A組の人数は" + roomA.number + "人です");
        System.out.println("8.1年B組の人数は" + roomB.number + "人です");

    }

}
