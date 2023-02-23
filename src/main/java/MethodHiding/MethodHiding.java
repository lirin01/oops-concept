package MethodHiding;
class data{
    public static void show(){
        System.out.println("in data");
    }
}
class Display extends data{
    public static void show(){
        System.out.println("in Display");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        Display display=new Display();
        display.show();
    }
}
