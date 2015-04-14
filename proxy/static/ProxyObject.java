public class ProxyObject implements Interface{
    private RealObject ro;

    public ProxyObject( RealObject ro){
        this.ro = ro;
        System.out.println("this is ProxyObject!");
    }

    public void proxyTest(){
        System.out.println("ProxyObject proxy test");
        ro.proxyTest();
    }
}
