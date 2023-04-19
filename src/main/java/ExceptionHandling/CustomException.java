package ExceptionHandling;

public class CustomException extends RuntimeException {
    CustomException(String exp){
        System.err.println(exp);
    }

    public static void main(String[] args) {
        try{
            throw new CustomException("jasjd");
        }
        catch(Exception e){

        }
    }

}


