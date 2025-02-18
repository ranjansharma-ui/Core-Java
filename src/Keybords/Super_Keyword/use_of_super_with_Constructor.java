package Keybords.Super_Keyword;


import Constructor.Parameterized;

class ParentClass {
    public boolean istrue(){
        return true;
    }
}

class childclass extends ParentClass {
    public boolean istrue(){
        boolean ParentResult = super.istrue();
        return !ParentResult;
    }
}
public class use_of_super_with_Constructor {
    public static void main(String[] args) {
        childclass child = new childclass();
        boolean result = child.istrue();
        System.out.println(result);
    }
}
