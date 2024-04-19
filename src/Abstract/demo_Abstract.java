package Abstract;

// notes :
/*
Abstract means which is a idea & does not a have a concrete life,
    ABSTRACT CLASS HAS METHODS WITH EMPTY BODIES.

         INTERFACE VS ABSTRACT
*) We can implement multiple parent interface to a class but we cannot create a class with multiple parent abstract class

1) We can create a abstract class to set a standard/ general info from which derived class are going to be made,
it is compulsory to implement all the abstract methods in the derived class of abstract class .
2) we cannot create object of a abstract class cauz itself abstract is  not a real class.
3) In a abstract class we have to define only the method names like:- abstract void run(),
and not the method we write the parameters for the method in the class in which it is going to be implemented
4) If we want to write a abstract method in a normal class it is compulsory to make the class abstract .
5) an abstract class can hold abstract methods as well as normal methods .
*/

abstract class Animal{

    abstract void eats();
    abstract void Eyes();

}
class Tiger extends Animal
{
    public  Tiger(){
        System.out.println("tiger is Created");
    }
    @Override
    void eats() {

        System.out.println("Tiger Eat's Other animals");
    }
    @Override
    void Eyes() {
        System.out.println("Tiger has 2 eyes");
    }
}

class Giraffe extends Animal{

    public Giraffe(){
        System.out.println("giraffe is created");
        System.out.println("i am the tallest animal ");
    }

    @Override
    void Eyes() {
        System.out.println("I have 2 eyes");
    }

    @Override
    void eats() {
        System.out.println("I am herbivorous");
    }
}

public class demo_Abstract {

public static void main(String args[]){
    Tiger t1 = new Tiger();
    t1.eats();t1.Eyes();
    Giraffe g1 = new Giraffe();
    g1.Eyes();g1.eats();

    }
}
