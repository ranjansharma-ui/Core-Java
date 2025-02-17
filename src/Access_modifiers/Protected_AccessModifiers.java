package Access_modifiers;

/*
    Protected :- The method or data member declared as protected are accessible within
                  the same package or subclass in different packages.
 */


class Section {
    protected void display(){
        System.out.println("Section_8");

    }
}

class section_8 extends Section{

}


public class Protected_AccessModifiers {
    public static void main(String[] args) {
        Section s = new Section();
        s.display();
        section_8 sec = new section_8();
        sec.display();
    }
}
