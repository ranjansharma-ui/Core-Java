package Access_modifiers;
/*
   Public :- Classes, methods or data members that declared
              as public are accessible from everywhere in the program.
 */
class Student1{
    public void display(){
        System.out.println("Program");
    }
}

public class Public_Access_Modifiers {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        stu.display();
    }
}
