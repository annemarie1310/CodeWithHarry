package LamdaExpressions;

interface greet{

    void hello();

    //void bonjour();

}

public class Lamda_java {

    public static void main(String[] args) {

        // Below is done through anonymous Class .
/*
        greet g1 = new greet() {
            @Override
            public void hello() {
                System.out.println("hello from USA ");
            }

            @Override
            public void bonjour() {
                System.out.println("Hello from France ");
            }
        };
        g1.hello();
*/
  //      greet g1 = new greet();  // this will not work because you cannot make object of interface .


        // Below is Using lambada Expressions .
            // to use this you have to have only one method in your method .
        // if you have more than 1 method then lambada Expression will not work .
        // Lambada Expression let us create the object without implementing the interface to a class .
        greet obj = ()->
        {
            System.out.println("Hello from USA ");
        };

    }
}
