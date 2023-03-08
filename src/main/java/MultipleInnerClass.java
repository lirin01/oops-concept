class a{
    void a(){
        System.out.println("in a");
    }
    class b{
        void b(){
            System.out.println("in b");
        }
        class c{
            void c(){
                System.out.println("in c");
            }
            class d{
                void d(){
                    System.out.println("in d");
                }
            }
        }
    }
}
public class MultipleInnerClass {
    public static void main(String[] args) {
        a aa=new a();
        a.b bb=aa.new b();
        a.b.c cc=bb.new c();
        a.b.c.d dd=cc.new d();
        dd.d();
    }
}
