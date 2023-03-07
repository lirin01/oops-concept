package Examples;

class GrandParent{
    int a=30;
    public void check(){
        System.out.println("checking");
    }
}
class Parent extends GrandParent{
    int b=30;
    Parent(int a){

    }
}
class Child extends Parent{
    Child(){
        super(20);
        System.out.println(super.a);
        super.check();
    }

}

public class AccessingGrandparentClass{
    public static void main(String[] args) {
        Child c=new Child();
    }
}
