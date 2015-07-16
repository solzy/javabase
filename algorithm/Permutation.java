import java.util.*;

public class Permutation{
    
    public static void swap(Integer[] ret , int a , int b){
        int temp = 0 ;
        temp = ret[a];
        ret[a] = ret[b];
        ret[b] = temp;
    }

    public static void permutation(Integer[] ret, int pos){
        if( pos == ret.length-1 ){
            System.out.println(Arrays.asList(ret));
            return;
        }

        for(int i = pos ; i < ret.length ; i++){
            swap(ret, i , pos);
            System.out.println("before" + Arrays.asList(ret) + " " +  i + " =>" + pos);
            permutation(ret , pos+1);
            swap(ret, i , pos);
            System.out.println("after" + Arrays.asList(ret) + " " +  i + " =>" + pos);
        }
    
    
    }


    public static void main(String[] args){
        Integer[] ret = {1,2,3};
        permutation(ret,0);
    }
}
