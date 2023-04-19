package Examples;

class parent1{
    private int i=10;
    parent1(int i){
        this.i=i;
    }
    void display(){
        System.out.println(i);
    }
    class inner{
        void change(int ch){
            i=ch;
        }
    }
}
public class ChangingPrivateVariableWithInnerObject{
    public static void main(String[] args) {
        parent1 p = new parent1(3);
        p.display();
        parent1.inner x = p.new inner();
        x.change(54326);
        p.display();
    }
}