package Problems;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int k=2;
        rightRotate(arr,k);
    }
    static void rightRotate(int[] arr,int k){
        int length=arr.length;
        for(int i=0;i<k;i++){
            int temp=0;
            temp=arr[length-1];
            for (int j = arr.length-1; j >0; j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
