package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Arrayss arr =new Arrayss();
        int []numbers={1,2,3,4,5,8,6,5,5};
        int result= arr.LinearSearch(numbers,9);


        if(result!=-1)
        System.out.println("value found at index:"+result);
        else
            System.out.println("value not found ! ");




//        int []num=new int[8];
//       arr.input(num);
//      arr.Traversal(num);
//        arr.reverseTraversal(num);
//
//        arr.delete(numbers,8);
      //  arr.update(numbers,8,22);

      //  arr.reverseTraversal(numbers);


        //int []num=new int[5];
       // System.out.println(Arrays.toString(numbers));

    }



}
