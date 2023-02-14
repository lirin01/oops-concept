package ExceptionHandling;

public class Finally {
    public static void main(String[] args)  {
        try{
            int i=10;
            do{
                System.out.println(i);
            }
            while (i!=10);
            throw new Exception();
        }
        catch (Exception e){
            System.out.println("error in catch");
        }
        finally {
            System.out.println("in finally");
        }
    }
}
