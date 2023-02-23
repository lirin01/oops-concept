package ObjectCreation;
class Access{
    public void printOuter(){
        System.out.println("object is created using new keyword");
    }

}
public class NewKeyWord {
    public static void main(String[] args){
        Access a=new Access();
        a.printOuter();
    }
}
