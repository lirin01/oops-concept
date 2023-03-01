package SealedClass;
sealed class a permits b,d{
    public void run(){
        System.out.println("in a");
    }
}
non-sealed class b extends a{
    public void run2(){
        System.out.println("in b");
    }
}
class c {
    public void run3(){
        System.out.println("in c");
    }
}
non-sealed class d extends a{
    public void run4(){
        System.out.println("in d");
    }
}
public class SealedClass {
    public static void main(String[] args) {
        d obj=new d();
        obj.run();
    }
}
