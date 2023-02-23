package MultiLevelInheritance;

class addition{
    public void add(){
        System.out.println("Addition");
    }
}
class subtraction extends addition{
    public void sub(){
        System.out.println("subtraction");
    }
}
class Division extends subtraction{
    public void div(){
        System.out.println("Division");
    }
}
class multiplication extends Division{
    public void mul(){
        System.out.println("multiplication");
    }
}
class calculator extends multiplication{

}
public class MultiLevel{
    public static void main(String[] args) {
        calculator cal=new calculator();
        cal.add();
        cal.div();
        cal.mul();
        cal.sub();
    }
}