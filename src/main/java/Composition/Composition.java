package Composition;

import java.util.*;
class StudentDetails {
    public String student_name;
    public int student_age;
    StudentDetails(String student_name, int student_age)
    {
        this.student_name = student_name;
        this.student_age = student_age;
    }
}
class School{
    private final List<StudentDetails> student;
    School(List<StudentDetails> student)
    {
        this.student = student;
    }
    public List<StudentDetails> getListStudentDetails()
    {
        return student;
    }
}
class Composition {
    public static void main(String[] args)
    {
        List<StudentDetails> student = new ArrayList<>();
        student.add(new StudentDetails("khan", 18));
        student.add( new StudentDetails("vimal", 19));
        student.add(new StudentDetails("ajay", 17));
        School Details = new School(student);

        List<StudentDetails> student_list= Details.getListStudentDetails();

        for (StudentDetails c : student_list) {
            System.out.println("Student name : " + c.student_name + " -----> " + "  Student Age : " + c.student_age);
        }
    }
}
