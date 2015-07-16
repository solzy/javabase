import java.util.Arrays;

/**
 * Created by asko on 6/28/15.
 */
public class Qsort {
    public static void swap(Integer[] ret , int a , int b){
        int temp = 0 ;
        temp = ret[a];
        ret[a] = ret[b];
        ret[b] = temp;
    }

    public static void qsort(Integer arr[] , int start , int end){
        int i = start;
        int j = end;
        int center = (start + end) / 2;
        int povit = arr[center];
        while(i < j ){
            while(arr[i] < povit) i++;
            while(arr[j] > povit) j--;
            swap(arr, i , j);
        }

        if(start < i) qsort(arr, start, i - 1);
        if(j < end) qsort(arr, j + 1, end);
    }

    public static void main(String[] args) {
        Integer arr[] = {5,3,11,1,9,6,2,7,8,0,10};
        qsort(arr, 0 , arr.length-1);
        System.out.println(Arrays.asList(arr));
    }
}
