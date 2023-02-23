package Aggregation;

class Details{
    String name;
    int number;
    Details(int number,String name){
        this.name=name;
        this.number=number;
    }

}
public class Aggregation{
    public static void main(String[] args) {
        Details d=new Details(1,"jhon");
    }
}