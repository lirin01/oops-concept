package ExecutionBlock;
class Display{
    static {
        System.out.println("static block");
    }
    {
        System.out.println("block");
    }
    Display(){
        System.out.println("constructor block");
    }
}
public class ExecutionBlock {
    public static void main(String[] args) {
        Display display=new Display();
    }
}
