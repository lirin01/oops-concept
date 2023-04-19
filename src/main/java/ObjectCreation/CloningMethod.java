package ObjectCreation;
class Create implements Cloneable{
    String name;
    Create(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("in display create class");
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

}
public class CloningMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
        Create create=new Create("raja");
        Create create1=(Create) create.clone();
        System.out.println(create1.name="kamal");
        System.out.println(create.name);
    }
}
