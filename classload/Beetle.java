package classload;

/**
 * @author asko
 * 1. At first , the static field be initialized 
 * 2. when execute construct function , from member variable to 
 *    member function initialized sequentially.
 * Running result:
	static Insect .x1 initialized!
	static Beetle.x2 initialized!
	beetle constructor!
	i = 9. j = 0
	Beetle .k initialized!
	k = 0
	j = 39
 */
public class Beetle extends Insect{
    private int k = printInt("Beetle .k initialized!");
    public Beetle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInt("static Beetle.x2 initialized!");
    
    public static void main(String[] args){
        System.out.println("beetle constructor!");
        Beetle b = new Beetle();
    }
}
