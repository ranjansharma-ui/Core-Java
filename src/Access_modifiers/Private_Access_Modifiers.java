package Access_modifiers;

/*

   # Private Access-modifier :- The methods or data members declared as
                                 Private are accessible only within the class.
 */

class A
{
    private void display(){
        System.out.println("This is a private methods");
    }
}

public class Private_Access_Modifiers
{


    public static void main(String[] args) {
        A a = new A();


//        a.display();  // error :- display has Private access in obj.display();
    }
}
