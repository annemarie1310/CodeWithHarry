package Exception_handelling;

/*
An Exception is an event that occurs when a program is executed disrupting the normal flow of the instructions
there are mainly 2  types of exceptions in java .
1) checked exception : -compiled time exceptions ( handled by the compiler )
2) unchecked  exception : - Runtime exceptions .
       Commonly occurring exceptions are :-
1)  null pointer exceptions .
2) Arithmetic  exceptions
3) Array index out of bound .
3) illegal Argument exceptions .
4) Number format exceptions .

*/

public class Exception_handelling_demo {

    public static void main(String[] args) {

        int a =9000;
        int b = 0;
/*
        // without try catch block (exception handeling ) below !!!
        int c = a/b;                                       //  HERE IT WILL GIVE ERROR -- CANT DIVIDE BY 0.
        System.out.println("The result is : "+c);
        // end.
*/
        //with try catch block
        try {
            int c = a/b;
            System.out.println("The result is : "+c);
        }
        catch (Exception e){
            System.out.println("program failed reason :");
            System.out.println(e);
        }
        System.out.println("End of the program .");

    }


}
