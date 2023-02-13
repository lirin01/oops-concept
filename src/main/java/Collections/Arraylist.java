package Collections;

import java.util.ArrayList;

class EmployeeDetails{
    int employee_id;
    String employee_name;
    EmployeeDetails(int employee_id,String employee_name){
        this.employee_id=employee_id;
        this.employee_name=employee_name;
    }
}
public class Arraylist{
    public static void main(String ... check){
        ArrayList<EmployeeDetails> arrayList=new ArrayList<>();
        arrayList.add(new EmployeeDetails(1,"lokesh"));
        arrayList.add(new EmployeeDetails(2,"kumar"));
        arrayList.add(new EmployeeDetails(3,"Raju"));
        arrayList.forEach(a-> System.out.println("employee id : "+a.employee_id+"\n"+"employee name : "+a.employee_name));
    }
}
