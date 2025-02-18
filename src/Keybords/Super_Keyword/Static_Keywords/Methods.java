package Keybords.Super_Keyword.Static_Keywords;
/*
   -> if we want to get access the another class of method without using any object,
       so whenever the declare methods to use static keywords
 */

public class Methods {
    static double result(int redius){
        double Area = 3.14*redius*redius;
        return Area;
    }

    public static void main(String[] args) {
        double result = result(7);
        System.out.println(result);
    }
}
