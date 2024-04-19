package Exception_handelling;

// below is how you can make a ( custom exceptions in a class ) .
class NegativeRadiusException extends Exception{

    @Override
    public String toString() {
        return "Radius cannot be negative ";
    }

    public String getMessage(){
        return "Radius cannot be negative ";
    }
}
public class Throw_throws {

    //  below we use ( Throws ) keyword so that the user or other programmer can know that this function may throw an exception.
    // Throws keyword is used to declare a exception

    public static double area (int r) throws NegativeRadiusException
    {
        if (r<0){
            throw new NegativeRadiusException();
        }
// above we use ( Throw ) keyword to use less of cpu and to throw the exception END the program right-over there .
// Throw is a keyword used to throw an exception explicitly by the programmer .

        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a ,int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }
        public static void main(String[] args) {

        try {
            int c = divide(10,0);
            System.out.println("Result is :"+c);

            //  below is the area function try
            double ar = area(5);
            System.out.println("Area if circle is :"+ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }



    }

}
