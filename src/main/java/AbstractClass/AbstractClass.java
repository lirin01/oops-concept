package AbstractClass;
abstract class Internet{
    public abstract void connect();
    public abstract void call();
    final static void display(){
        System.out.println("gdfjsh");
    }
}
class Airtel extends Internet{
    public void connect(){
        System.out.println("you are connected through Airtel network");
    }
    public void call(){
        System.out.println("your call is placed via Airtel network");
    }
}
class Vodafone extends Internet{
    public void connect(){
        System.out.println("you are connected through Vodafone network");
    }
    public void call(){
        System.out.println("your call is placed via Vodafone network");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Airtel AirtelServiceProvider=new Airtel();
        AirtelServiceProvider.connect();
        Vodafone vodafoneServiceProvider=new Vodafone();
        vodafoneServiceProvider.call();
    }
}
