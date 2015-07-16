import java.lang.reflect.*;
public class SimpleDynamicProxy{
    public static void cosumer(Interface iface ){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args ){
        RealObject real = new RealObject();
        cosumer( real );
        
        //Insert a proxy and call again
        Interface proxy = (Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
