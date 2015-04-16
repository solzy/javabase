import java.lang.reflect.*;
public class SimpleDynamicProxy{
    public static void consumer(Interface iface ){
        iface.proxyTest();
    }

    public static void main(String[] args ){
        RealObject real = new RealObject();
        consumer( real );
        
        //Insert a proxy and call again
        Interface proxy = (Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
