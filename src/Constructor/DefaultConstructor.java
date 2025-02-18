package Constructor;
/*

   Constructor :- Constructor is a block of codes similar to the methods, but constructor do not
                  any return types exist.

                -> The constructor of class  must have the same names as the class name in which it resides
                -> A constructor in java cannot be abstract,final,static or Synchronized.
                -> Constructor do not return any type of datatype

       # Type of Constructor in java
         1. Default Constructor
         2. Parameterized Constructor
         3. Copy Constructor

 */

/*
    1. Default constructor :- A constructor that has no parameters is known as default the constructor.
 */


class Student {
    Student(){
        System.out.println("Default constructor ");
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {

    Student s = new Student();
    }


}
