public class Object_ouyou2_0502 {
    public static void main(String[] args) throws Exception {
        Sales salesA = new Sales("商品A", 100,30,true);
        Sales salesB = new Sales("商品B", 89,40,true);
        Sales salesC = new Sales("商品C", 250,90,true);
        Sales salesD = new Sales("商品D", 320,23,false);

        //配列にcarを格納
        Sales[] salesTeam = new Sales[4];
        salesTeam[0] = salesA;
        salesTeam[1] = salesB;
        salesTeam[2] = salesC;
        salesTeam[3] = salesD;

        System.out.println("割引率は" + salesA.getWaribiki());
        System.out.println(salesA.getName() + "の通常の販売価格は" + salesA.getSalsePrice(false) + "円です");
        System.out.println(salesA.getName() + "の通常の割引価格は" + salesA.getSalsePrice(true) + "円です");

        for(int i = 0; i < 4; i++) {
                System.out.println(salesTeam[i].getName() + "の価格は" + salesTeam[i].getSalsePrice(salesTeam[i].getOver30()) + "円です");
        }
    }

}
