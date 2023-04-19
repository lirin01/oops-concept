package InnerClasses;

class OuterClass{
    void check(){
        System.out.println("in check");
    }
    static  class inner{
        int a=10;
        static int b=20;
        void run(){
            System.out.println("running");
        }
        static void check1(){
            System.out.println("in dvhjgfhjs");
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        OuterClass.inner o=new OuterClass.inner();
        o.run();
    }
}
