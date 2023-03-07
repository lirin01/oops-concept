package Examples;

abstract class outer{
    public  class inner{
        public void run(){
            System.out.println("running");
        }
    }
}
class Demo extends outer{
    public static void main(String[] args) {
        outer a=new Demo();
        outer.inner b= a.new inner();
        b.run();
    }
}