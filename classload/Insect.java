package classload;

public class Insect{
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = " + i + ". j = "+j);
        j = 39;
    }
    private static int x1 = 
        printInt( "static Insect .x1 initialized!");
    static int printInt(String s){
        System.out.println(s);
        return 0;
    }
}
