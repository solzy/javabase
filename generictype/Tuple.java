public class Tuple<K,V>{
    private K key;
    private V value;

    public Tuple( K k , V  v){
        key = k;
        value = v;
    }

    public K getKey(){
        return key;
    }
    
    public V getValue(){
        return value;
    }

    public static void main( String[] args){
        Tuple<Integer,String> t = new Tuple<Integer,String>(1, "hello");
        System.out.println(t.getKey());
        System.out.println(t.getValue());
    }

}
