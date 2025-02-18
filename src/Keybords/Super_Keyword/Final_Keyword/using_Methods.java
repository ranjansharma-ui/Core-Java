package Keybords.Super_Keyword.Final_Keyword;


class first{
    final void show(){
        System.out.println("Hi");
    }
}
class Person extends first{
//    final void show(){
//        System.out.println("hello i'm in second class");
//    }
}
public class using_Methods {
    public static void main(String[] args) {
        Person p = new Person();
        p.show();
    }
}
 /*
   error : show() in Keybords.Super_Keyword.Final_Keyword.Person cannot override show() in Keybords.Super_Keyword.Final_Keyword.first
  overridden method is final
  */