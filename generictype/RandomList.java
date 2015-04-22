import java.util.*;

public class RandomList<T>{
    private ArrayList<T> s = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add( T item ){
        s.add(item);
    }

    public T select(){
        return s.get(rand.nextInt(s.size()));
    }

    public static void main(String[] args){
        RandomList<Integer> list = new RandomList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.print(list.select());
    }
}
