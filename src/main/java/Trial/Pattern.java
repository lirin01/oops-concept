package Trial;
import java.util.Scanner;
public class Pattern{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("n : ");
        int n=scan.nextInt();
        for(int i=0;i<=(n/2);i++){ // top
            for (int j = (n/2)-i; j >0; j--) {
                System.out.print("-    ");
            }
            for (int j = 1; j <=(i+1); j++) {
                System.out.print(Math.round(Math.pow(n,j))+"    ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(Math.round(Math.pow(n,j))+"    ");
            }
            for (int j = 0; j <(n/2)-i; j++) {
                System.out.print("-    ");
            }
            System.out.println();
        }
        for (int i = 0; i <(n/2); i++) { //bottom
            for (int j = 0; j <=i; j++) {
                System.out.print("-    ");
            }
            for (int j = 1; j <=(n/2)-i ; j++) {
                System.out.print(Math.round(Math.pow(n,j))+"    ");
            }
            for (int j =((n/2)-1)-i; j >=1; j--) {
                System.out.print(Math.round(Math.pow(n,j))+"    ");
            }
            for (int j = i; j >=0; j--) {
                System.out.print("-    ");
            }
            System.out.println();
        }
    }
}
