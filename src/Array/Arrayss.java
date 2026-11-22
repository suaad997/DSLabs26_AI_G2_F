package Array;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner =new Scanner(System.in);

    public void Traversal(int []a){
        for(int i=0;i<a.length;i++)
            System.out.println("Index["+i+"]="+a[i]);
    }


    public void reverseTraversal(int []a){
        for(int i=a.length-1;i>= 0;i--)
            System.out.println("Index["+i+"]="+a[i]);
    }

    public void input(int []a){
        System.out.println("Enter "+a.length+" elements:");
        for(int i=0; i<a.length;i++){
            a[i]=scanner.nextInt();
        }
    }

    public void update(int []a, int index, int nvalue){
        if(index<0 || index>=a.length)
            System.out.println("Index not found");
        else
            a[index]=nvalue;
    }
    public void delete(int []a, int index){
        if(index<0 || index>=a.length)
            System.out.println("Index not found");
        else
            a[index]=0;
    }

    public int LinearSearch(int []a ,int svalue){
        for(int i=0; i<a.length;i++) {
            if(svalue==a[i])
                return i;
        }
       return -1;
    }

// a={3,7,8,9,13,22}  f=0  l=5   s=13
    public int binarySearch(int []a, int findex, int lindex,int svalue){
        while (findex<=lindex) {
            int mid = (findex + lindex) / 2;  //4
            if (svalue == a[mid])
                return mid;
            if (svalue > a[mid])
                findex = mid + 1;  //3
            if (svalue < a[mid])
                lindex = mid - 1;
        }
        return -1;

    }
    //a={1,5,6,8,-765544444};     d=3     i=3
    public void shift_left_delete(int []a, int index){
        if(index<0 || index>=a.length){
            System.out.println("Index not found");
            return;}
        for(int i=index; i<a.length-1; i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=Integer.MIN_VALUE;
    }









}
