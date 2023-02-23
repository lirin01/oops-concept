package ObjectCreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class NewClass{
    private NewClass(){

    }
    public void show(){
        System.out.println("object is created using reflection constructor method");
    }
}
public class ConstructorReflectionMethod {
    public static void main(String[] args) throws Exception {
        Constructor<NewClass> constructor=NewClass.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        NewClass n=constructor.newInstance();
        n.show();
    }
}
