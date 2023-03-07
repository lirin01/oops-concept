package Examples;

class ParentClass{
    class Inner{
        Inner(){
            System.out.println("Im in parent");
        }
        void run(){
            System.out.println("parent");
        }
    }
}
class ChildClass extends ParentClass{
    class Inner{
        Inner(){
            System.out.println("Im in child");
        }
        void run(){
            System.out.println("child");
        }
    }
}

class TryClassOverriding{
    public static void main(String[] args) {
        ChildClass child=new ChildClass();
        ChildClass.Inner inner=child.new Inner();
        inner.run();


    }
}