public class GenericMethods{
    public <T> void f (T t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args){
        GenericMethods gm = new GenericMethods();
        gm.f(1);
        gm.f("");
        gm.f(2.34);
        gm.f(0L);
        gm.f(' ');
    }
}
