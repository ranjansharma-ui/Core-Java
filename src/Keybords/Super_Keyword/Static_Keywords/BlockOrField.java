package Keybords.Super_Keyword.Static_Keywords;
/*
   -> if you need to do the Computation in order to initialize your static variables, you can declare
      a static block that gets execute exactly once.when the class is first loaded.
 */
public class BlockOrField {
    // static variable

    static int a = 10;
    static int b = a;

    static {
        System.out.println("Static block initialized");
        b = a*4;
    }

    public static void main(String[] args) {
        System.out.println("From main");
        System.out.println("value of a :"+a);
        System.out.println("value of b :"+b);

    }

}
