package Generics;

class datatype<A,B,C>{
    A a;
    B b;
    C c;
    datatype(A a,B b,C c){
        System.out.println(a.getClass().getName());
        this.a=a;
        this.b=b;
        this.c=c;
    }
}


public class Generics{
    public static void main(String[] args) {
        datatype<? extends String,String,Double> data=new datatype("fgfgfgh","jbvjhbvb",0.1);
        System.out.println(data.a.getClass().getName());
        System.out.println(data.b.getClass().getName());
        System.out.println(data.c.getClass().getName());
    }
}

