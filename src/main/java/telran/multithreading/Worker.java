package telran.multithreading;

public class Worker extends Thread{
    private static final Object mutex1 = new Object();
    private static final Object mutex2 = new Object();

    @Override
    public void run(){
        f1();
        f2();
    }

    public void f1() {
        synchronized (mutex1) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                
            }
            synchronized (mutex2) {
                
            }
        }
    }

    public void f2() {
        synchronized (mutex2) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                
            }
            synchronized (mutex1) {
                
            }
        }
    }

}
