import java.util.*;

//rewrite Iterator
public class AdapterMethodIdiom{
    class ReversibleArrayList<T> extends ArrayList<T>{

        public ReversibleArrayList(Collection<T> c){
            super(c);
        }

        public Iterable<T> reversed(){
            return new Iterable<T>(){
                public Iterator<T> iterator(){
                    return new Iterator<T>(){
                        private int current = size() - 1;

                        public boolean hasNext(){
                            return current > -1;
                        }

                        public T next(){
                            return get(current--);
                        }
                        
                        public void remove(){
                    //                    throw new UnsupportedoperationException();
                        }
                    };
                }
            };
        }
    }

    public static void main(String[] args){
        AdapterMethodIdiom ami = new AdapterMethodIdiom();
        Collection<String> c = Arrays.asList("To be or not to be".split(" "));
        ReversibleArrayList<String> ral = ami.new ReversibleArrayList<String>(c);
        for(String s : ral){
            System.out.print(s +" | ");
        }
        System.out.println();
        for(String s : ral.reversed()){
            System.out.print(s +" | ");
        }
    }

}

