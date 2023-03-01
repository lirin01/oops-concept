package Inheritance;
interface abc{

}
class ATM{
    ATM(){
        System.out.println("ATM");
    }
    public void withdrawal(){
        System.out.println("you have withdraw 1000");
    }
    public void credit(){
        System.out.println("account has credited to the account");
    }
}
class Bank extends ATM{
    Bank(){
        System.out.println("Bank");
    }
    public void openAccount(){
        System.out.println("you have opened a new account");
    }
    public void accountStatement(){
        System.out.println("account statement");
    }
}
class ReserveBank extends Bank{

}
public class Inheritance {
    public static void main(String[] args) {
        Bank bank=new Bank();
//        ReserveBank reserveBank=new ReserveBank();
        bank.withdrawal();
    }
}
