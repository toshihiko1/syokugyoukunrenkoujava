public class Room {
    private int grade;
    private String klass;
    public int number;

    public Room(int grade, String klass, int number) {
        this.grade = grade;
        this.klass = klass;
        this.number = number;
    }


    public boolean isFullClass() {
        if(this.number == 40) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isManyPeople(Room ninzu){
        if(this.number > ninzu.number) {
            return true;
        }else{
            return false;
        }
    }

    // アクセサメソッド get
    public int getGrade() {
        return grade;
    }

    public String getKlass() {
        return klass;
    }

    public int getNumber() {
        return number;
    }

}
