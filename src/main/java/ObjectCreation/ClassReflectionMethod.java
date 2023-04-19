package ObjectCreation;

class outer{
    outer(){

    }
    public void printOuter(){
        System.out.println("object is created using reflection method");
    }

}
public class ClassReflectionMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        outer o = outer.class.newInstance(); //command either this or
//        Class a= Class.forName("ObjectCreation.outer"); // this
//        outer o = (outer) a.newInstance();
        o.printOuter();
    }
}
