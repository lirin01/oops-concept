package ExecutionBlock;
class Display{
    static int a=10;
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
//        System.out.println(Display.a);
        Display display=new Display();
    }
}
