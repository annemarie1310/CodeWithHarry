package MultiThreading;



// below is how to run thread with runnable interface .
class MultiThreading1 implements Runnable{

    public void run() {
        int i = 0;
        while (i <= 4000) {

            System.out.println("Multithreading 1 ......");
        }
    }
}
class MultiThreading2 implements Runnable{

    public void run() {
        int i = 0;
        while (i <= 4000) {

            System.out.println("Multithreading 2 ......");
        }
    }
}


public class Thread_with_runnable_interface extends Thread{

    public static void main(String args[]){
        MultiThreading1 bullet1 = new MultiThreading1();
        Thread gun1 = new Thread(bullet1);
        MultiThreading2 bullet2 = new MultiThreading2();
        Thread gun2 = new Thread(bullet2);                   // imp step to run thread with runnable interface .
        gun1.start();                // to start the multithreading with runnable interface we have to do the above step .
        gun2.start();

    }
}