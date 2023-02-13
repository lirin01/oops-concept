package MethodOverLoading;
class Calculator{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.add(1,2);
        calculator.add(1,2,3);
        calculator.add(1,2,3,4);
    }
}
