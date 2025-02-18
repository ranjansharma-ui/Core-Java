package Keybords.Super_Keyword.Abstract_Keywords;
/*
  #Abstact Class :-
      i) An abstract class is declared using the abstract keyword.
     ii) It can have both abstract methods(methods with a body) and concrete method(methods with a body)
    iii) Abstract classes cannot be instantiated directly

 */

abstract class Section{
    abstract void info();
    abstract void duration();
    abstract  void subject();
}

class BCA extends Section
{
    void info(){
        String name = "Bachelor of computer Application";
        System.out.println("Course name : "+name);

    }
    void duration(){
        int year = 3;
        System.out.println("Total year: "+ year);

    }
    void subject(){
        String sub = "Java Programming";
        System.out.println("Subject:"+sub);

    }
}

class Btech extends Section{
    void info(){
        String name = "Bachelor of Technology";
        System.out.println("Course name : "+name);

    }
    void duration(){
        int year = 4;
        System.out.println("Total years : "+ year);

    }
    void subject(){
        String sub = "Mathematics";
        System.out.println("Subject :"+sub);
    }
}
public class Abstact_Class {
    public static void main(String[] args) {
        // if you want to check BCA course
        BCA B = new BCA();
        B.info();
        B.duration();
        B.subject();

        //if you want to check Btech course
        Btech Bt = new Btech();
        Bt.info();
        Bt.duration();
        Bt.subject();
    }
}
