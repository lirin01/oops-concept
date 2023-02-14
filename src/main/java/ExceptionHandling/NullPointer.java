package ExceptionHandling;



public class NullPointer {
    private static void printLength(String str) throws NullPointerException {
        System.out.println(str.length());
    }

    public static void main(String args[]) {
        String myString = null;
        try{
            printLength(myString);
        }
        catch(Exception e){
            System.out.println("good");
        }
    }
}