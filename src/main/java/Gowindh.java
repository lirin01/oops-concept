import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
class Model{
    ArrayList<Task> array=new ArrayList();
    public Task getTask(int task_id){
        return array.get(task_id-1);
    }
    public ArrayList<Task> getTask(){
        return array;
    }
    public void setTask(Task task){
        array.add(task);
    }
}
class Controller{
    static int task_id=1;
    public void line(){
        System.out.println("----------------------------------------------------------------------------------------");
    }
    public void addTask(Scanner scanString,Model model){
        System.out.print("Enter the task title : ");
        String task_title=scanString.nextLine();
        System.out.print("Enter the task text : ");
        String task_text=scanString.nextLine();
        System.out.print("Enter the task assigned to : ");
        String assigned_to=scanString.nextLine();
        Task task=new Task(task_id,task_title,task_text,assigned_to);
        model.setTask(task);
        task_id++;
        line();
        System.out.println("new task created successfully");
    }
    public void updateTask(Model model,Scanner scanInt,Scanner scanString){
        System.out.print("Enter your task id : ");
        int task_id= scanInt.nextInt();
        line();
        Task task=model.getTask(task_id);
        System.out.println("Enter 1 to update task title");
        System.out.println("Enter 2 to update task text");
        System.out.println("Enter 3 to update assigned to");
        line();
        System.out.print("Enter your choice : ");
        int choice= scanInt.nextInt();
        line();
        switch (choice) {
            case 1: {
                System.out.print("Enter new update to task title : ");
                task.task_title=scanString.nextLine();
                break;
            }
            case 2: {
                System.out.print("Enter new update to task text : ");
                task.task_text=scanString.nextLine();
                break;
            }
            case 3: {
                System.out.print("Enter new update to assign to : ");
                task.assigned_to=scanString.nextLine();
                break;
            }
        }
    }
    public void deleteTask(Model model,Scanner scanInt){
        ArrayList<Task> data=model.getTask();
        System.out.print("Enter the task id to delete : ");
        int id=scanInt.nextInt();
        data.add(id-1,null);
    }
    public void viewTask(Model model,Scanner scanInt) {
        System.out.print("Enter id to view : ");
        Task ts = model.getTask(scanInt.nextInt());
        if (ts == null) {
            System.out.println("found null data");
        } else {
            System.out.println(ts.task_id);
            System.out.println(ts.task_title);
            System.out.println(ts.task_text);
            System.out.println(ts.assigned_to);
        }
    }
}
class Task{
    int task_id=0;
    String task_title;
    String task_text;
    String assigned_to;
    Task(int task_id,String task_title,String task_text,String assigned_to){
        this.task_id=task_id;
        this.task_title=task_title;
        this.task_text=task_text;
        this.assigned_to=assigned_to;
    }
}
public class Gowindh{
    public static void main(String[] args) {
        Scanner scanInt=new Scanner(System.in);
        Scanner scanString=new Scanner(System.in);
        Model model=new Model();
        Controller controller=new Controller();
        Integer a=Integer.MAX_VALUE;
        while(a!=0){
            controller.line();
            System.out.println("Enter 0 to exit");
            System.out.println("Enter 1 to add task");
            System.out.println("Enter 2 to update a task");
            System.out.println("Enter 3 to delete a task");
            System.out.println("Enter 4 to search a task");
            controller.line();
            System.out.print("Enter your choice : ");
            int choice= scanInt.nextInt();
            controller.line();
            switch (choice){
                case 0:
                {
                    a=0;
                    break;
                }
                case 1:
                {
                    controller.addTask(scanString,model);
                    break;
                }
                case 2:
                {
                    controller.updateTask(model,scanInt,scanString);
                    break;
                }
                case 3:
                {
                    controller.deleteTask(model,scanInt);
                    break;
                }
                case 4:
                {
                    controller.viewTask(model,scanInt);
                    }
                    break;
                }
            }
        }
    }
