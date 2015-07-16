/**
 * Created by asko on 6/25/15.
 */
public class BinarySearch {

    public static int binarySearch(int[] arr , int num){
        int start = 0;
        int end = arr.length-1;

        while( start < end ){
            int mid = (end - start) / 2 + start ;
            System.out.println("mid: " + mid);
            if ( arr[mid] > num){
                end = mid ;
            } else if ( arr[mid] < num ){
                start = mid ;
            } else {
                return mid;
            }
        }
        System.out.println("------------------------");
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5};
//        System.out.println(binarySearch(arr1,2));
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr2,5));
        int[] arr3 = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr3,3));
        int[] arr4 = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr4,7));
    }
}
