package MultiThreading;

/*
Multiprocessing and multiThreading are both achieved to perform multitasking .
1) multiprocessing means :- opening chrome,vscode,notepad,paint etc.. on a operating system (eg:- windows ) is multiprocessing

when we want to do multitasking within a process then we use threads ,
Threads are part of a process, and it shares memory with process .
Threads are light-weight and process is heavy-weight
Threads are used to shared memory area; Threads are faster content switching .
Threads can interact with each other very fast

  Eg : -a word document has o=more than one thread working when opened like one thread running in foreground as and editor
  and another in the background for auto-saving etc ....

---------------------------------------------------------------------------------------------------------------
  HOW PROCESS WORKS WITHOUT THREAD :  !!!!!!!!!!!!

     MAIN --> FUNCTION1--> FUNCTION2-->FUNCTION3-->END.
(above first main file will get executed then function1 then function1 then function3 and then END .)
----------------------------------------------------------------------------------------------------------------
       HOW PROCESS WORKS WITHOUT THREAD :   !!!!!!!!!!!!

       MAIN ----
                |
                V
      FUNCTION1--------------> END .
                    ^
                    |
      FUNCTION2------

( here after running main it will get all the functions and execute them concurrently (at one time) .
---------------------------------------------------------------------------------------------------------
Creating a Thread ;  there are 2 ways to creat thread in java .
1) by extending the Thread class
2) by implementing runnable interface .

*/


class MyThread1 extends Thread {

    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("My Thread is cooking ....");
            System.out.println("I am Happy");
            i++;
        }
    }
}


class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("I am learning Coding   ....");
            System.out.println("I am Exited");
            i++;
        }
    }
}

    
    public class MultiThreadding_with_classExtended{
        public static void main(String[] args) {
            MyThread1 m1 = new MyThread1();
            MyThread2 m2 = new MyThread2();
            m1.start();
            m2.start();

        }
    }




