package Keybords.Super_Keyword;
/*
  => this is used when we want coll the method of parent class, so whenever a parent and child class have the
     same-named methods then to resolve ambiguity we use the super keyword.
 */


class Student {
    void message(){
        System.out.println("this is a student class");
    }
}

class Person extends Student
{
    void message(){
        super.message();
    }
}
public class With_methods {
    public static void main(String[] args) {
        Person p = new Person();
        p.message();
    }

}
