package MultiThreading;

import java.util.concurrent.*;

public class SchedulingThread extends Thread {
    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newScheduledThreadPool(10);
        service.schedule(new SchedulingThread(),3,TimeUnit.SECONDS);
        service.scheduleAtFixedRate(new SchedulingThread(),1,2,TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(new SchedulingThread(),4,5,TimeUnit.SECONDS);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
