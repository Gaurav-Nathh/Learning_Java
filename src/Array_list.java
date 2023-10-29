import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(64);
        // list.add(27);
        // list.add(87);
        // list.add(37);
        // System.out.println(list.contains(87));
        // list.set(0,55);
        // for(int i=0;i<5;i++){
        //     list.add(in.nextInt());
        // }
        // for(int i=0;i<5;i++){
        //     System.out.println(list.get(i));
        // }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
   } 
}
