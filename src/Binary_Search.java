public class Binary_Search {
    public static void main (String[] args){
        long start = System.nanoTime();
        int[] arr = {-18,-16,-14,-12,-10,-8,-6,-4,-2,0,2,4,6,8,10,12,14,16,18,20};
        int target = 4;
        // int ans = BinarySearch(arr, target);
        int ans = linear_s(arr, target); 
        System.out.println(ans);
        long duration = (System.nanoTime() - start)/1000000;
        System.out.println(duration +"ms");
    }
    static int linear_s(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }else{
                return -1;
            }
        }
        return -1;
    }
    //return the index
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else if(target>arr[mid]){
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else if(target<arr[mid]){
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    // static int BinarySearch(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length-1;
    //     while(start<=end){
    //         //find the middle element
    //         // int mid = (start + end) / 2;
    //         int mid = start + (end-start) / 2;
    //         if(target<arr[mid]){
    //             end = mid-1;
    //         }else if(target>arr[mid]){
    //             start = mid+1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }
}
