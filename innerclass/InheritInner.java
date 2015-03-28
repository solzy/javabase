package innerclass;

//Inheriting an inner class

public class InheritInner{
    class WithInner{
        class Inner{}
    }    
    
    public class InheritInnerTest extends WithInner.Inner{
    	
        //InheritInnerTest(){ } is cant compile 
        //if you ready to invoke default instructor of super class:
        // enclosingClassReference.super();
        public InheritInnerTest( WithInner wi){
            wi.super();
        }
    }
    

    public static void main(String[] args){
    	InheritInner ii = new InheritInner();
        WithInner wi = ii.new WithInner();
        InheritInnerTest iit = ii.new InheritInnerTest(wi);
    }
}
