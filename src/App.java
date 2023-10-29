import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
    //     int rollno = 20;
    //     char name = 'g';
    //     float marks = 98.8f;
    //     double largeDecimalNumber = 467654.45641;
    //     long largeInterger = 456897321654789324L;
    //     boolean check = false;
        // Scanner input = new Scanner(System.in);
        // try{
        //     // int rollno = input.nextInt();
        //     // System.out.println("Your Roll Number is "+rollno);
        //     float num1 = input.nextFloat();
        //     float num2 = input.nextFloat();
        //     int sum = num1+num2;
        //     System.out.println("Sum is "+sum);
        // } finally{
        //     input.close();
        // }
        // int a = 258;
        // byte b = (byte)(a);
        // System.out.println(b);
        // int number = 'A';
        // System.out.println(number);
        // byte b = 42;
        // char c = 'a';
        // short s = 1024;
        // int i = 5000;
        // float f =5.67f
        // double d = 0.1324;
        // double result = (f*b)+
        // int count = 1;
        // while(count<5){
        //     System.out.println(count);
        //     count++;
        // 
        // for(int i=0;i<5;i++){
        //     System.out.println(i);
        // }
        // Scanner in = new Scanner(System.in);
        // try{
        //     System.out.println("Please enter temprature in C: ");
        //     float tempC = in.nextFloat();
        //     float tempF = (tempC * 9/5) + 32;
        //     System.out.println(tempF);
        // } finally{
        //     in.close();
        // }
        // int salary = 9000;
        // int result = (salary>10000) ? (salary+=1000) : (salary+=2000);
        // System.out.println(result);
        // for(int i=0;i<5;i++){
        //     for(int j=5;j>i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Scanner in = new Scanner(System.in);
        // try{
        //     int a = in.nextInt();
        //     int b = in.nextInt();
        //     int c = in.nextInt();
        //     // int max = a;
        //     // if(b > max){
        //     //     max = b;
        //     // }
        //     // if(c > max){
        //     //     max = c;
        //     // }
        //     // System.out.println(max);
        //     int max = Math.max(c,Math.max(a,b));
        //     System.out.println(max);
        // }finally{
        //     in.close();
        // }
        // Scanner in = new Scanner(System.in);
        // try{
        //     char ch = in.next().trim().charAt(0);

            // if(ch>='a'&&ch<='z'){
            //     System.out.println("LowerCase");
            // }else{System.out.println("UpperCase");}
        // }finally{
        // in.close();
        // }
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;
        // while(count<=n){
        //      int temp = b;
        //      b = b+a;
        //      a = temp;
        //      count++;
        // }
        // System.out.println(b);
        // int count = 0;
        // while(n > 0){
        //     int rem = n % 10;
        //     if(rem == 3){
        //         count++;
        //     } n = n/10;
        // }
        // System.out.println(count);
        // int result = 0;
        // while(n > 0){
        //     int rem = n % 10;
        //     n /=10;
        //     result = result * 10 + rem; 
        // }
        //   System.out.println(result); 

        // Calculator

        // Scanner in = new Scanner(System.in);
        // try{
        //     int result = 0;
        //     while (true){
        //         System.out.print("Enter the operation ");
        //         char op = in.next().trim().charAt(0);
        //         if(op == '+'||op == '-'||op == '*'||op =='/'|| op=='%'){
        //             System.out.print("Enter first Number ");
        //             int num1 = in.nextInt();
        //             System.out.print("Enter second Number ");
        //             int num2 = in.nextInt();
        //             if(op == '+'){
        //                 result = num1 + num2;
        //             }
        //             if(op == '-'){
        //                 result = num1 - num2;
        //             }
        //             if(op == '*'){
        //                 result = num1 * num2;
        //             }
        //             if(op == '/'){
        //                 if(num2 != 0){
        //                     result = num1 + num2;
        //                 }
        //             }
        //             if(op == '%'){
        //                 result = num1 % num2;
        //             }
        //             System.out.println("Answer: "+result);
        //         }
        //         else if (op =='x'||op =='X'){
        //             break;
        //         }
        //         else{
        //             System.out.println("Invalid operation");
        //         }
        //     }
        // }finally{
        
        //     in.close();
        // }
        // int age = System.out.println("Enter your Age: ");
        // System.out.println(age);
        // Scanner in = new Scanner(System.in);
        // String fruit = in.next();
    //     try{
    //     switch(fruit) {
    //         case "Mango":
    //             System.out.println("King of Furits");
    //             break;
    //         case "Apple":
    //             System.out.println("A sweet red Fruit");
    //             break;
    //         case "Orange":
    //             System.out.println("Round Fruit");
    //             break;
    //         case "Grapes":
    //             System.out.println("Small Fruit");
    //         default:
    //             System.out.println("Please Ener a Valid Fruit");
    //     }
    //     }finally{
    //         in.close();
    //     }
            // try{
            //     int day = in.nextInt();
            //     switch(day) {
            //         case 1 -> System.out.println("Monday");
            //         case 2 -> System.out.println("Tuesday");
            //         case 3 -> System.out.println("Wednesday");
            //         case 4 -> System.out.println("Thrusday");
            //         case 5 -> System.out.println("Friday");
            //         case 6 -> System.out.println("Saturday");
            //         case 7 -> System.out.println("Sunday");
            //         default -> System.out.println("Enter a valid a Number.");
            //     }
            // }finally{
            //     in.close();
            // }
            // try{
            //     int name = in.nextInt();
            //     int course = in.nextInt();
            //     switch(name){
            //         case 1 ;
            //             switch(course){
            //                 case 1 -> System.out.println("MCA");
            //             };
            //         case 2 -> System.out.println("Nitin");
            //         case 3 -> System.out.println("Ritesh");
            //     }
            // }finally{
            //     in.close();
            // } 
            // System.out.println("Enter your Name: ");
            // Scanner in = new Scanner(System.in);
            // try{
            // String name = in.next();
            // String personalised = myGreet(name);
            // System.out.println(personalised);
            // }finally{
            //     in.close();
            // }
            // System.out.println(myName("Gaurav"));
            // int[] arr = {1, 3, 2, 45, 6};
            // change(arr);
            // System.out.println(Arrays.toString(arr));
            // int[] arr = new int[5];
            // System.out.println(arr[5]);
            // String[] arr = new String[5];
            // System.out.println(arr[0]);
            // int[] arr = new int[5];
            // arr[0] = 10;
            // arr[1] = 20;
            // arr[2] = 30;
            // arr[3] = 40;
            // arr[4] = 50;
            // System.out.println(arr[3]);
            // Scanner in = new Scanner(System.in);
            // for(int i=0; i<arr.length; i++){
            //     arr[i] = in.nextInt();
            //    }
            // for(int num : arr){//this is for each loop
            //     System.out.println(num + "Hello Bro");
            // }
            // for(int num: arr){
            //     System.out.println(num + " Hello Bro");
            // }
            // String [] str = new String[4];
            // for(int i = 0; i<str.length; i++){
            //     str[i] = in.next ();
            // }
            // System.out.println(Arrays.toString(str));

            // int[] num = {3, 4, 5, 6, 7};
            // System.out.println(Arrays.toString(num));
            // change(num);
            // System.out.println(Arrays.toString(num));
            // Scanner in = new Scanner(System.in);
            // int[][] arr = new int[3][3];
            // System.out.println(arr.length);
            // for(int row = 0; row<arr.length; row++){
            //     for(int col = 0; col<arr[row].length;col++){
            //         arr[row][col] = in.nextInt();
            //     }
            // }
            // for(int row = 0; row<arr.length; row++){
            //     for(int col = 0; col<arr[row].length;col++){
            //         System.out.print(arr[row][col]+" ");
            //     }
            //     System.out.println();
            // }
    //         for(int row=0;row<arr.length;row++){
    //             System.out.println(Arrays.toString(arr[row]));
    //         }
    //   }
    //   static String myGreet(String name){
    //     String message = "Hello "+ name;
    //     return message;
    //   }
    // static String  myName(String n){
    //     String naam = "Gaurav Nath";
    //     return naam;
    // }
    // static void change(int[] nums) {
    //     nums[0] = 99;
    // }
    // static void change(int[] arr){
    //     arr[0] = 5;
    // }
    // int[] arr = {1, 12, 3, 4, 5, 67, 345, 39, 357, 2, 345, 7};
    // swap(arr, 2 ,3);
    // System.out.println(Arrays.toString(arr));
    // System.out.println(max(arr));
    // reverse(arr);
    // System.out.println(Arrays.toString(arr));
    // System.out.println(linearSearch2(arr, 345));
    // String name = "Gaurav";
    // System.out.println(char_linear_seach(name, 'f'));
    // int[] arr = {18, 12, -7, 3, 14, 28};
    // System.out.println(min(arr));
    // int[][] arr = {
    //     {23, 4, 1},
    //     {10, 12 ,3, 9},
    //     {78, 99, 34, 56},
    //     {19 ,12}
    // };
    // int target = 34;
    // int[] ans = DD_linear_search(arr,target);
    // System.out.println(Arrays.toString(ans));ṇ
    // System.out.println(DD_max_value(arr));
    int[][] accounts = {
        {1,2,3},
        {3,2,1},
    };
    System.out.println(maxWealth(accounts));

}
static int maxWealth(int[][] accounts){
    int ans = Integer.MIN_VALUE;
    // for(int person=0;person<accounts.length;person++){
    //     for(int account=0;account<accounts[person].length;account++){
    //         sum += accounts[person][account];
    //     }
    //     if(sum>ans){
    //         ans = sum;
    //     }
    // }
    for(int[] ints:accounts){
        int sum = 0;
        for(int anInt:ints){
            sum+=anInt;
        }
        if(sum>ans){
            ans = sum;
        }
    }
    return ans;
}
static int findNumbers(int[] nums){
    int count = 0;
    for(int num: nums){
        if(even(num)){
            count++;
        }
    }
    return count;
}
static int digits(int num){
    int count = 0;
    while (num>0) {
       count++;
       num/=10; 
    }
    return count;
}
static boolean even(int num){
    int numberOfDigits = digits(num);
    // if(numberOfDigits % 2 ==0){
    //     return true;
    // }
    // return false;
    return numberOfDigits % 2 == 0;
}
static int DD_max_value(int[][] arr){
   int max = Integer.MIN_VALUE; 
   for(int[] ints:arr){ 
    for(int element:ints){
        if(element > max){
            max = element;
        }
    }
   }
   return max;
}
static int[] DD_linear_search(int[][] arr, int target){
    for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
        }
    }
    return new int[] {-1,-1};
}
// static int min(int[] arr){
//     int ans = arr[0];
//     for(int i = 1;i<arr.length;i++){
//         if(arr[i]<ans){
//             ans = arr[i];
//         }
//     }
//     return ans;
// }
// static boolean char_linear_seach(String str, char target){
//     if(str.length()==0){
//         return false;
//     }
//     for(char ch:str.toCharArray()){
//         if(ch==target){
//             return true;
//         }
//     }
//     return false;
// }
// static int linearSearch(int[] arr, int target){
//     if(arr.length == 0){
//         return -1;
//     }
//     for(int i=0;i<arr.length;i++){
//         int element = arr[i];
//         if(element == target){
//             return i;
//         }
//     }
//     return -1;
// }
// static boolean linearSearch2(int[] arr, int target){
//     if(arr.length==0){
//         return false;
//     }
//     for (int element:arr){
//         if(element == target){
//             return true;
//         }
//     }
//     return false;
// }
// static void reverse(int[] arr){
//     int start = 0;
//     int end = arr.length-1;
//     while (start<end) {
//        swap(arr, start, end);
//        start++;
//        end--;
//     }
// }
// static void swap(int[] arr, int index1, int index2){
//     int temp = arr[index1];
//     arr[index1] = arr[index2];
//     arr[index2] = temp;
// }
// static int max(int[] arr){
//     int maxval = arr[0];
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]>maxval){
//             maxval = arr[i];
//         }
//     }
//     return maxval;

// }
}