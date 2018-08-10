package Miscellaneous;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String args[]) {
        Semaphore s = new Semaphore(1);
        Receive r = new Receive(s);
        Sender sender = new Sender(s);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(sender);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }

}

class Receive implements Runnable{
    Semaphore s = null;

    public Receive(Semaphore s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
        for (int i = 0; i < 11; i += 2) {
            this.s.acquire();
            System.out.println("Thread" + Thread.currentThread().getName() + i);
            this.s.release();
            Thread.sleep(10);
            }

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Sender implements Runnable{
    Semaphore s = null;

    public Sender(Semaphore s) {
        this.s = s;
    }
    @Override
    public void run() {
        try {

        for (int i = 1; i <= 11; i += 2) {
            this.s.acquire();
            System.out.println("Thread" + Thread.currentThread().getName() + i);
            this.s.release();
            Thread.sleep(10);
            }

        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}