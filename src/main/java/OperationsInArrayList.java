import java.util.ArrayList;
import java.util.Scanner;

public class OperationsInArrayList {
    public static void main(String[] args) {
        ArrayList array=new ArrayList();
        Scanner scanInt=new Scanner(System.in);
        Scanner scanString=new Scanner(System.in);
        Integer a=Integer.MAX_VALUE;
        while(a!=0){
            System.out.println("Enter 0 to exit");
            System.out.println("Enter 1 to add task");
            System.out.println("Enter 2 to update a task");
            System.out.println("Enter 3 to delete a task");
            System.out.println("Enter 4 to search a task");
            System.out.print("Enter your choice : ");
            int choice= scanInt.nextInt();
            switch (choice){
                case 0:
                {
                    a=0;
                    break;
                }
                case 1:
                {
                    System.out.print("Enter the new task : ");
                    array.add(scanString.nextLine());
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the index number need to be updated : ");
                    int c=scanInt.nextInt();
                    array.remove(c);
                    System.out.print("Enter the new task needed to be updated : ");
                    String task=scanString.nextLine();
                    array.add(c,task);
                    break;
                }
                case 3:
                {
                    System.out.print("Enter the index number need to be deleted : ");
                    int c=scanInt.nextInt();
                    array.remove(c);
                    array.add(c,null);
                    break;
                }
                case 4:
                {
                    System.out.print("enter the task need to searched : ");
                    String task=scanString.nextLine();
                    for(int x=0;x<array.size();x++){
                        String temp=(String)array.get(x);
                        if(temp==null);
                        else if(temp.equals(task)){
                            System.out.println("the task number is "+(x+1));
                        }
                    }
                }
            }
            System.out.println(array);
        }

    }
}