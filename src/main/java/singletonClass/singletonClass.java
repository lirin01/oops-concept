package singletonClass;
class Stream{
    private static Stream obj=null;
    public static Stream openStream(){
        if(obj==null){
            obj=new Stream();
            System.out.println("object created");
        }
        return obj;
    }
}
public class singletonClass {
    public static void main(String[] args) {
        Stream.openStream();
        Stream.openStream();

    }
}
