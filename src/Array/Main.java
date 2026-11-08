package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Arrayss arr =new Arrayss();
        //int []numbers={1,2,3,4,5,8,6,5,5};
        int []num=new int[8];

       arr.input(num);
      arr.Traversal(num);
        //arr.reverseTraversal(numbers);


        //int []num=new int[5];
       // System.out.println(Arrays.toString(numbers));

    }



}
