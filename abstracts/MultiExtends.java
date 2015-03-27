package abstracts;

//With concrete or abstract classes, inner
//classes are the only way to produce the
//effect of "multiple implementation inheritance"

public class MultiExtends{
    public static void takesD(D d){}
    public static void takesE(E e){}

    class D{}
    abstract class A{}
    public class E extends A{}
    public class Z extends D{
        public E makeE(){ return new E();}
    }

    public static void main(String[] args){
    	MultiExtends me = new MultiExtends();
    	Z z =  me.new Z();
        takesD(z);
        takesE(z.makeE());
        
    }

}
