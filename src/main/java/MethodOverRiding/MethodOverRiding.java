package MethodOverRiding;
class BankInterest{
     void interest(){
        System.out.println("your interest rate is : 5%");
    }

}
class IndianBankInterest extends BankInterest{
     void interest(){
////        super.internet(a);
        System.out.println("your interest rate is : 7.5%");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        BankInterest bank1=new IndianBankInterest();
        bank1.interest();
    }
}
