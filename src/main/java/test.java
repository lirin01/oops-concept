class parent implements Cloneable{
    public void check(){
        System.out.println("ch");
    }
}
class child extends parent{
    public void check1(){
        System.out.println("ch1");
    }
}
public class test{
    public static void main(String[] args) throws Exception{
        parent b=new child();
    }
}