package MultiThreading.ThreadPooling;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLocking extends Thread {
    static BlockingQueue a=new ArrayBlockingQueue(10000);
    static ReentrantLock lock=new ReentrantLock();
    public static void main(String[] args)  {
        ThreadLocking d=new ThreadLocking();
        d.start();
        lock.lock();
        for(int i=0;i<10;i++){
            a.add(i*1);
            a.add(i*10);
            a.add(i*100);
            a.add(i*1000);
            System.out.println("main : "+a);
        }
        lock.unlock();
    }
    public void run(){
        lock.lock();
        for(int i=0;i<=50;i++){
            a.poll();
            System.out.println("thread : "+a);
        }
        lock.unlock();
    }
}
