package Problems;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {-36, -28, 83, 59, -5, -22, 15, 64, 33, -85, -99, -94};
        long k=40;
        leftRotate(arr,k);
    }
    static void leftRotate(int[] arr,long k){
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for (int j = 0; j <arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
//            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

}
