package Keybords.Super_Keyword.Abstract_Keywords;
/*
  Interface : An interface is a reference type in java.
              it is similar to a class  it is a collection of abstract method and static constants.

         Note: inside the interface class of method, if we inherit another class it's mandatory to implement the methods same-named
               and if interface class to inherit another class using "implements" keywords not "extends" keywords.

               ->interface class allows to use field, method declaration by default,public,static,final(constant)
 */



interface Bycycle{
    void cycleName();
    void cycleModel();
    void cyclePrice();

    //field
    String info = "Hava a good day";

}

class show implements Bycycle{
    @Override
    public void cycleName() {
        String name = "Avengers";
        System.out.println("Name : "+name);

    }
    public void cycleModel(){
        String Model = "25X07";
        System.out.println("Model : "+Model);
    }
    public void cyclePrice(){
        String Price = "$20k";
        System.out.println("Price : "+Price);

    }
}
public class Interface {
    public static void main(String[] args) {
        show sh = new show();
        sh.cycleName();
        sh.cycleModel();
        sh.cyclePrice();

        System.out.println(Bycycle.info);

    }
}
