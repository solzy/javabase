package interfaces;

public class Callback{
    interface Incrementable{
        void increment();
    }

    class Callee1 implements Incrementable{
        private int i = 0;
        public void increment(){
            i++;
            System.out.println("Value of i variable Currently: "+i);
        }
    }

    static class MyIncrement{
        public void increment(){
            System.out.println("Other operate!");
        }
        public static void f(MyIncrement mi){
            mi.increment();
        }
    }

    class Callee2 extends MyIncrement{
        private int i = 0;
        public void increment(){
            super.increment();
            i++;
            System.out.println("Value of i variable Currently: "+i);
        }

        private class Closure implements Incrementable{
            public void increment(){
                //Specify outer-class method , otherwise
                //you'd get an infinite recursion
                Callee2.this.increment();
            }
        }
        
        public Incrementable getCallbackReference(){
            return new Closure();
        }
    }

    private class Caller{
        private Incrementable callbackReference;

        public Caller( Incrementable cbh ){
            callbackReference = cbh;
        }
        
        public void go(){
            callbackReference.increment();
        }
    }
    
    public static void main(String[] args){
    	Callback cb = new Callback();
        Callee1 c1 = cb.new Callee1();
        Callee2 c2 = cb.new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = cb.new Caller( c1 );
        Caller caller2 = cb.new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
    }
}
