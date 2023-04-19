package MethodOverLoading;
class Calculator{

    public void bank(String name,String password){

    }
    public void bank(int amount,long account_number,String function){
        System.out.println("your amount ");
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
//        calculator.add(1,2);
//        calculator.add(1,2,3);
//        calculator.add(1,2,3,4);
    }
}
