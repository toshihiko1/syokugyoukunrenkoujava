public class Object_hukusyu3_0428 {
    public static void main(String[] args) throws Exception {
        Cat catA = new Cat("リッキー猫", 0);
        catA.showProfile();
        catA.sleep();
        catA.speak();

        Horse horseA = new Horse("リッキー馬", 0);
        horseA.showProfile();
        horseA.run();
        horseA.speak();

        Animal[] animalTeam = new Animal[4];
            animalTeam[0] = catA;
            animalTeam[1] = horseA;
            animalTeam[2] = catA;
            animalTeam[3] = horseA;

        for(int i = 0; i <= 3; i++) {
            animalTeam[i].speak();
        }

    }
}
