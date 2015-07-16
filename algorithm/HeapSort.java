import java.io.IOException;
import java.util.Arrays;

/**
 * Created by asko on 7/15/15.
 */
public class HeapSort {

    public static void swap(Integer[] ret , int a , int b){
        int temp = 0 ;
        temp = ret[a];
        ret[a] = ret[b];
        ret[b] = temp;
    }

    public static void heapSort(Integer[] arr){
        for (int i = arr.length / 2; i >= 0 ; i--)
            PercDown(arr, i, arr.length);

        for (int i = arr.length -1 ; i > 0 ; i--) {
            swap(arr, 0, i);
            PercDown(arr, 0, i);
        }

    }

    public static int getLeft( int i){
        return i * 2 + 1;
    }

    public static int getRight( int i){
        return i * 2 + 2;
    }

    public static void PercDown( Integer[] arr , int i , int N){
        int tmp , left;
        for( tmp = arr[i] ; getLeft(i) <  N  ; i = left){
            left = i * 2 + 1;
            if(left != arr.length && arr[left + 1] > arr[left])
                left++;
            if(arr[i] > arr[left])
                arr[i] = arr[left];
            else
                break;
        }
        arr[i] = tmp;
    }

    public static void main(String[] args) {
        Integer arr[] = {5,3,11,1,9,6,2,7,8,0,10};
        heapSort(arr);
        System.out.println(Arrays.asList(arr));
    }
}
