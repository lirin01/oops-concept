package Problems;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        Scanner scan=new Scanner(System.in);
        int[] a ={1, 2, 4, 6, 7, 5};
        for (int i = 0; i < a.length; i++) {
            if(a[i]>first){ // 1>0
                second=first;
                first=a[i]; // 1
            } else if (a[i]>second && a[i]!=first) {
                second=a[i];
            }
        }
        System.out.println(second);
    }
}