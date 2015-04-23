import java.util.*;

public class GenericVarArgs{
    
    public static <T> List<T> makeList(T... args){
        ArrayList<T> list = new ArrayList<T>();
        for(T arg :args){
            list.add(arg);
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println(makeList(2,4,2,6,8,7,9));
    }
}
