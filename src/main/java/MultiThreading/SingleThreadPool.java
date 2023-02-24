package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool extends Thread{
    int i;
    public static void main(String[] args) {
        ExecutorService service= Executors.newSingleThreadExecutor();
        for (int i = 0; i < 20; i++) {
            service.execute(new SingleThreadPool(i));
        }
    }
    SingleThreadPool(int i){
        this.i=i;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+i);
    }
}
