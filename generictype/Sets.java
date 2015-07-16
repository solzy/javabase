import java.util.*;

public class Sets{

    public static <T> Set<T> union(Set<T> set, Set<T> subSet){
        Set<T> res = new HashSet<T>(set);
        res.addAll(subSet);
        return res;
    }        
    public static <T> Set<T> intersection(Set<T> set, Set<T> subSet){
        Set<T> res = new HashSet<T>(set);
        res.retainAll(subSet);
        return res;
    }        
    public static <T> Set<T> difference(Set<T> set, Set<T> subSet){
        Set<T> res = new HashSet<T>(set);
        res.removeAll(subSet);
        return res;
    }        
    
    public static <T>  Set<T> complement(Set<T> set , Set<T> subSet){
        return difference(union(set,subSet) , intersection(set,subSet));
    }
}
