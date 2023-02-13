package ConstructorOverLoading;
class Bank{
    Bank(String username,String password){
        System.out.println("logged into the account");
    }
    Bank(long account_number,int amount,String transaction_type ){
        System.out.println("amount "+transaction_type+" to the account number : "+account_number);
    }
}
public class ConstructorOverLoading {
    public static void main(String[] args) {
        Bank bank=new Bank("lirin.stalin","12344");
        Bank bank1=new Bank(121324789342l,1000,"credit");
    }
}
