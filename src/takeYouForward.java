import java.util.Arrays;

public class takeYouForward {
    public static void main(String[] args){
    //    int arr1[] = {2,5,3,6,4,7};
    //    System.out.println(sort(arr1));
    //    int[] arr2 = {2,63,6,7,334,7,2};
    //    System.out.println(sort(arr2));
    // System.out.println(findLargestElement(arr1));
    // System.out.println(findLargestElement(arr2));
    int arr[] = {1,2,7,4,5},n=5;
    System.out.println(isSorted(arr, n));
    }    
    static int sort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    static int findLargestElement(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static boolean isSorted(int[] arr, int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1])
            return false;
        }
        return true;
    }
}