package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int number;
        Scanner scan=new Scanner(System.in);
        try{
            System.out.print("enter number : ");
            number= scan.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("the input accepted is only integer,you have entered a wrong type");
        }
    }
}
