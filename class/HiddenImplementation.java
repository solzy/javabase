import java.lang.reflect.*;
public class HiddenImplementation{
    interface A{
        void f();
    }

    class C implements A{
        public void f(){ System.out.println(" public C.f();");}
        public void g(){ System.out.println(" publi C.g(); ");}
        void u() { System.out.println("package C.u()");}
        protected void v(){System.out.println("protected C.v()");}
        private void w(){ System.out.println("private C.w()");}
    }

    class HiddenC{
        public A makeA(){ return new C();}
    }

    public static void main(String[] args) throws Exception{
      HiddenImplementation hi = new HiddenImplementation();
      HiddenC hc = hi.new HiddenC();
      A a = hc.makeA();
      a.f();
      System.out.println(a.getClass().getName());

      if(a instanceof C){
        C c = (C)a;
        c.g();
      }
      callHiddenMethod(a , "g");
      callHiddenMethod(a , "u");
      callHiddenMethod(a , "w");
      callHiddenMethod(a , "v");
    }

    static void callHiddenMethod(Object a, String methodName)
        throws Exception{
        Method g = a.getClass().getDeclaredMethod(methodName);
//        g.setAccessible(true);
        g.invoke(a);
    }
}
