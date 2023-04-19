package Aggregation;
class AirCondition{
    public void on(){
        System.out.println("Air condition in on state");
    }
}
class Fan{
    public void on(){
        System.out.println("fan is in on state");
    }
}
public class Aggregation{
    public static void main(String[] args) {
        AirCondition a=new AirCondition();
        Fan b=new Fan();
        a.on();
        b.on();
    }
}