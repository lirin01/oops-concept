package Generics;

class datatype<A,B,C>{
    A a;
    B b;
    C c;
    datatype(A a,B b,C c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
}


public class Generics{
    public static void main(String[] args) {
        datatype<Integer,String,Double> data=new datatype(1,"jbvjhbvb",0.1);
        System.out.println(data.a.getClass().getName());
        System.out.println(data.b.getClass().getName());
        System.out.println(data.c.getClass().getName());
    }
}

