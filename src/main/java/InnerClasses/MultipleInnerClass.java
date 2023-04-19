package InnerClasses;

class Outer{
    void show(){
        System.out.println("in outer");
    }
    class Inner1{
        void show(){
            System.out.println("in Inner1");
        }

        class Inner2{
            void show(){
                System.out.println("in Inner2");
            }
            class Inner3{
                void show(){
                    System.out.println("in Inner3");
                }
            }
        }
    }
}
public class MultipleInnerClass {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner1 inner1=outer.new Inner1();
        Outer.Inner1.Inner2 inner2=inner1.new Inner2();
        Outer.Inner1.Inner2.Inner3 inner3=inner2.new Inner3();
        inner3.show();
    }
}
