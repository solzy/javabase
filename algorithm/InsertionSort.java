import java.util.Arrays;

/**
 * Created by asko on 7/15/15.
 */
public class InsertionSort {

    public static void insertionSort(Integer arr[] ){
        int j;
        for (int i = 1; i < arr.length ; i++) {
            int tmp = arr[i];
            for ( j = i; j > 0 && arr[j - 1] < tmp ; j--) {
              arr[j] = arr[j-1];
            }
            System.out.println("j>>>>" + j);
            arr[j] = tmp;
        }
        System.out.println(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        Integer[] x = { 6, 2, 4, 1, 5, 9 };
        insertionSort(x);
    }
}
