package Problems;

import java.util.Arrays;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,2,4,6,0,23,0,3,0,0,0,0,5,2,0,4,8,1, 0, 0, 0, 4};
        PushZerosToEnd obj = new PushZerosToEnd();
        obj.pushZeroToEnd(arr);


    }

    void pushZeroToEnd(int a[]) {
        int count=0;
        int temp=0;
        int length = a.length;
        for(int z=0;z<length;z++){
            if(a[z]==0){
                count++;
            }
        }
        for (int i = 0; i < length;i++) {
            if (a[i] == 0) {
                for (int j = i; j < length; j++) {
                    if (j == length - 1) {
                        if(temp!=count){
                            temp++;
                            a[length - 1] = 0;
                            i--;
                        }
                    } else {
                        a[j] = a[j + 1];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}


