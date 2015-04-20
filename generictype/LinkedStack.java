public class LinkedStack<T>{

    private static class Node<U>{
        U node;
        Node<U> next;
        
        Node(){
            node = null;
            next = null;
        }

        Node( U t , Node<U> n ){
            node = t;
            next = n;
        }

        boolean end(){ return node == null && next == null;}
    }
    
    private Node<T> top = new Node<T>( );

    public void push( T t ){
        top = new Node<T>(t,top);
    }
    
    public T pop(){
        T n = top.node;
        if( ! top.end() ){
            top = top.next;
            return n;
        }
        return null;
    }
    
    public static void main(String[] args){
        LinkedStack<String> lss = new LinkedStack<String>();
        for(String s : "Phasers on stun !".split("")){
            lss.push(s);
        }
        String s = null;
        while((s = lss.pop()) != null){
            System.out.println(s);
        }
    
    }
}
