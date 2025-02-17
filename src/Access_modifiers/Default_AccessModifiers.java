package Access_modifiers;
/*
   what is Access-Modifiers :-
   -> Access modifiers help to restrict the scope of class, constructor, variable,
   method or data member. it provides security, accessibility etc

   There are four types of Access modifiers
   1. Default
   2. Protected
   3. Private
   4. public
 */

    /*
       default-modifiers => Having default access modifier are accessible only within the same package

     */

 class Student{
    static void display(){
        System.out.println("Hello world");
    }
}
public class Default_AccessModifiers {

    public static void main(String[] args) {
        Student.display();
    }
}
