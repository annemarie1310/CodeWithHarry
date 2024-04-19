package MultiThreading;
/*

  (     LIFE CYCLE OF A THREAD . )  !!!!
1. New: A new thread is created but not working. A thread after creation and before invocation of
   start() method will be in new state.

2. Runnable: A thread after invocation of start() method will be in runnable state.
   A thread in runnable state will be available for thread scheduler.

3. Running: A thread in execution after thread scheduler select it, it will be in running state.

4. Blocked: A thread which is alive but not in runnable or running state will be in blocked state.
   A thread can be in blocked state because of suspend(), sleep(), wait() methods or implicitly by JVM to perform I/O operations.

5. Dead: A thread after exiting from run() method will be in dead state.
   We can use stop() method to forcefully killed a thread.


*/

class Mythread extends Thread{

    public Mythread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<4){
            System.out.println("thread is running ");
            i++;
        }
    }

}

public class Thread_Constructors {

    public static void main(String[] args) {
        Mythread m1 = new Mythread("zoe");
        m1.start();
        System.out.println("the thread name is  : "+m1.getName());  // this is how you can set a name for a thread .
        System.out.println("the thread name is  : "+m1.getId());   // this is how you can get an Id  for a thread .
    }

}
