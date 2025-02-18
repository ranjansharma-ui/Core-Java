package Constructor;
/*
   Copy-constructor :- Unlike others constructor copy Constructor is passed with another object which copies the data
                         available from the passed object to the newly created Object.
 */


class Greek {
    String name;
    int id;
    Greek(String name,int id){
        this.name = name;
        this.id = id;

    }
    //copy constructor
    Greek(Greek g){
        this.name = g.name;
        this.id = g.id;
    }
}
public class Copy_Constructor {
    public static void main(String[] args) {
        Greek Ge = new Greek("Ranjan",453);

        System.out.println("First Object");
        System.out.println("Name :"+Ge.name+"\nId :"+Ge.id);

        Greek Ge2 = new Greek(Ge);
        System.out.println("second Object(copy constructor)");
        System.out.println("Name :"+Ge2.name+"\nId :"+Ge2.id);
    }
}
