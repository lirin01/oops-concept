package Problems;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        long k=2;
        leftRotate(arr,k);
    }
    static void leftRotate(int[] arr,long number){
        for(int i=0;i<number;i++){
            int temp=arr[0];
            for (int j = 0; j <arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}






















