package MethodHiding;
class data{
    public  void show(){
        System.out.println("in data");
    }
}
class Display extends data{
    public  void show(){
        System.out.println("in Display");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        data display=new Display();
        display.show();
    }
}
