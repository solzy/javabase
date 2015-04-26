import java.lang.reflect.*;
import java.util.*;

public class GenericArrayWithTypeToken<T>{
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type , int size){
        array = (T[])Array.newInstance(type ,size );
    }

    public void put(int index , T item){
        array[index] = item;
    }

    public T get(int index){ return array[index];}

    public T[] rep(){ return array;}

    public static void main(String[] args){
        GenericArrayWithTypeToken<Integer> ga =
            new GenericArrayWithTypeToken<Integer>(Integer.class  , 3);
        ga.put(0,1);
        ga.put(1,2);
        ga.put(2,3);
        System.out.println(Arrays.asList(ga.rep()));
    }
}
