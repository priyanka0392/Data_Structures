package Miscellaneous;

public class EvenOddGenerator implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 0; i < 11; i += 2) {
                    System.out.println("Thread" + Thread.currentThread().getName() + i);
                    this.wait(10);
                }
                this.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadImpl implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            try {
                this.wait(1);
                for (int i = 1; i <= 11; i += 2) {
                    this.wait(1);
                    System.out.println("Thread" + Thread.currentThread().getName() + i);
                    this.wait(10);
                }
                this.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class Call {
    public static void main(String args[]) {
        Runnable r1 = new ThreadImpl();
        Runnable r2 = new EvenOddGenerator();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}