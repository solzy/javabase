public class Main{
    
    public static void test( Interface  itf ){
        itf.proxyTest();
    }

    public static void main(String[] args){
        test( new RealObject() );
        test( new ProxyObject( new RealObject()));
    }

}
