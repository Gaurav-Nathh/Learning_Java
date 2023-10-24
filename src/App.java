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
            int[] arr = new int[5];
            // arr[0] = 10;
            // arr[1] = 20;
            // arr[2] = 30;
            // arr[3] = 40;
            // arr[4] = 50;
            // System.out.println(arr[3]);
            Scanner in = new Scanner(System.in);
            for(int i=0; i<arr.length; i++){
                arr[i] = in.nextInt();
               }
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i] + "Hello Bro ");
            }
      }
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
}
