public class ExceptionMatch{
    class ExceptionA extends Exception{
        public ExceptionA( ){
            System.out.println("Exception A");
        }
    }
    class ExceptionB extends ExceptionA{
        public ExceptionB(){
            System.out.println("Exception B");
        }
    }
    class ExceptionC extends ExceptionB{
        public ExceptionC(){
            System.out.println("Exception C");
        }
    }

    class A{
        void method() throws ExceptionA{
            throw new  ExceptionA();
        }
    }
    
    class B extends A{
        void method() throws ExceptionB{
            throw new  ExceptionB();
        }
    }
    class C extends B{
        void method() throws ExceptionC{
            throw new  ExceptionC();
        }
    }

    public static void main(String[] args){
        ExceptionMatch em = new ExceptionMatch();
        A instance = em.new C();
        try{
         instance.method();
        }catch(Exception e){
         //
        }
    }
}
