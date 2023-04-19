package InnerClasses;

class Dog{
    public void sound(){
        class Sound{
            String sound="bark";
        }
        Sound s=new Sound();
        System.out.println( s.sound);
    }
}
class Dog2 extends Dog{
    public void sound(){
        class Sound{
            String sound="bark sound is too low";
        }
        Sound s=new Sound();
        System.out.println( s.sound);
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sound();
    }
}
