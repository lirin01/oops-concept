package Examples;

class abc{
    class bcd{
        static class cde{
            void run(){
                System.out.println("dfjghgjsdh");
            }
            static void run1(){
                System.out.println("fsdgfgujdfsdfyuhedifuiwi");
            }
        }
    }
}
public class InnerClassWithStaticClass extends abc{
    public static void main(String[] args) {
        abc.bcd.cde c=new bcd.cde();
        c.run();
    }
}