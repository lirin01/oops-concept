package Encapsulation;

import java.util.ArrayList;

class Student{
    private  ArrayList<String> data= new ArrayList<>();
    public ArrayList<String> get(){
        return data;
    }
    public void set(ArrayList<String> data){
        this.data=data;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Student student=new Student();
        ArrayList<String> data=student.get();
        data.add("raj");
        data.add("kamal");
        data.add("suresh");
        student.set(data);

        System.out.println(student.get());
    }
}
