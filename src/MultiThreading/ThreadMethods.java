package MultiThreading;

class thread1 extends Thread{
    public void run() {
        int i = 0;
        while (i < 4) {
            System.out.println("thread is cooking ........ ");
            try // this block of try and catch will make the thread sleep for inputed number of milli-seconds.
            {
                Thread.sleep(10000);  // 1000 milli-sec = 1sec.
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
class thread2 extends Thread{
    public void run() {
        int i = 0;
        while (i < 4) {
            System.out.println("thread is dancing  ");
            i++;
        }
    }
}

public class ThreadMethods {

    public static void main(String[] args) {
        thread1 t1= new thread1();
        thread2 t2= new thread2();
        t1.start();
        try {
            t1.join();   // this method (join) of thread will stop running t2.start until t1.start is finished .
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();  // here beacuse of join method t2.start will not start until t1.start is finished

    }

}
