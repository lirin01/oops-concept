package MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ThreadUsingCallableInterface implements Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(20);
        List<Future> a=new ArrayList();
        for (int i = 0; i < 100; i++) {
            Future future=service.submit(new ThreadUsingCallableInterface());
            a.add(future);
        }
        for (int i = 0; i <100 ; i++) {
            Future f=a.get(i);
            System.out.println(f.get());
        }
    }
    public Integer call(){
        System.out.println("good");
        return new Random().nextInt();
    }
}
