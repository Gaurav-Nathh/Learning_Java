import java.util.Arrays;

public class celling {
   public static void main(String[] args){
    // int[] arr = {2,3,5,9,14,16,18};
    // int target = 15;
    // char[] letters = {'c','f','j','l'};
    // char target = 'm';
    int[] arr = {5,7,7,7,8,8,10};
    int target = 7;
    // int ans = floor(arr, target);
    // char ans = smallestLetter(letters, target);
    int[] ans = searchRange(arr,target);
    System.out.println(Arrays.toString(ans));
    // System.out.println(ans);
    }
    // static int Celling(int[] arr, int target){
    // int start = 0;
    // int end = arr.length-1;
    // while(start<=end){
    //     int mid = start+(end-start)/2;
    //     if(target<arr[mid]){
    //         end = mid-1;
    //     }else if(target>arr[mid]){
    //         start = mid+1;
    //     }else{
    //         return mid;
    //     }
    // }
    // return arr[start];
    // }
    // static int floor(int[] arr, int target){  
    // int start = 0;
    // int end = arr.length-1;
    // while(start<=end){
    //     int mid = start+(end-start)/2;
    //     if(target<arr[mid]){
    //         end = mid-1;
    //     }else if(target>arr[mid]){
    //         start = mid+1;
    //     }else{
    //         return mid;
    //     }
    // }
    // return arr[end];
    // }
    // static char smallestLetter(char[] letters, char target){
    //     int start = 0;
    //     int end = letters.length-1;
    //     while(start<=end){
    //         int mid = start = (end-start)/2;
    //         if(target<letters[mid]){
    //             end = mid-1;
                
    //         }else{
    //             start = mid+1;
    //         }
    //     }
    //     return letters[start%letters.length];
    // }
    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start/2);
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = end+1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
      return ans;  
    }
}
