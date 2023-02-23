package ThreadPooling;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class  all{

        }
public class ThreadPooling{
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(8);
        for(int i=0;i<100;i++){
            service.execute(new checker(i));
        }
        service.shutdown();
    }
    static class checker implements Runnable{
        int i;
        checker(int i){
            this.i=i;
        }
        public void run(){
            System.out.println(Thread.currentThread().getName()+"-->"+i+"-->"+LocalTime.now());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}