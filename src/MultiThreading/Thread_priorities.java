package MultiThreading;

class threadpriorities extends Thread{


    public threadpriorities(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("thread is running "+this.getName());
            i++;
        }
    }
}


public class Thread_priorities {
    public static void main(String[] args) {
        threadpriorities t1= new threadpriorities("helen");
        threadpriorities t2= new threadpriorities("anna");
        threadpriorities t3= new threadpriorities("josh");
        threadpriorities t4= new threadpriorities("bill ( MOST IMPORTANT !! )");
        threadpriorities t5= new threadpriorities("omar");


        // below is how you can set priorities for thread to run first or medium or last priority .
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }


}
