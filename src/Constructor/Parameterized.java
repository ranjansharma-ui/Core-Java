package Constructor;
/*
   2. Parameterized cons. := A constructor that has Parameters is known as Parameterized constructor.
 */

class Section {
    String name ;
    int id;

    Section(String name, int id){
        this.name = name;
        this.id = id;
    }
}

public class Parameterized {
    public static void main(String[] args) {


        Section sec = new Section("Ranjan", 345);
        System.out.println(sec.name);
        System.out.println(sec.id);
    }
}
