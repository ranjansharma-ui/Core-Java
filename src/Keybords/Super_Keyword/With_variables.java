package Keybords.Super_Keyword;
/*
   Use of Super with variables :- This Scenario occurs when a derived class and base class have  some
                                  datamember. in that case ,there is a Possibility the JVM
 */

class Vehical {
    int maxspeed = 120;

}
class Car extends Vehical
{
    int maxspeed = 180;

    void display(){
        System.out.println("Maximum speed : "+super.maxspeed);
    }
}
public class With_variables {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
