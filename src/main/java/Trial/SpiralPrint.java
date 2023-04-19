package Trial;

import java.util.Scanner;

public class SpiralPrint {
    static int count;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("n : ");
        int n=scan.nextInt();
        count=n+1;
        for (int row = 0; row <((2*n)+1); row++) {
            for(int col=0;col < ((2*n)+1); col++){
                System.out.print(Math.max(Math.abs(row - n), Math.abs(col - n)) + 1 + " ");
            }
            System.out.println();
        }
    }
}
