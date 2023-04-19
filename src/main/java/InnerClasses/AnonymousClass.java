package InnerClasses;

class Animals{
    final  static  int A=10;
    public void sound(){
        System.out.println("animal sound");
    }
}
class Lion extends Animals{
    public void sound(){
        System.out.println("lion roar");
    }
    public void hunt(){
        System.out.println("lion able to hunt");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Lion lion=new Lion(){
            public void sound(){
                System.out.println("lion is unable to roar now");
            }
            public void hunt(){
                System.out.println("it is unable to hunt now");
            }
            public void run(){
                System.out.println();
            }
        };
        lion.sound();
        lion.hunt();
    }
}
