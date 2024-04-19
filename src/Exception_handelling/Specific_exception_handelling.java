package Exception_handelling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Specific_exception_handelling {

    public static void main(String[] args) {

        int marks []=new int[3];
        marks[0]=10;
        marks[1]=100;
        marks[2]=90;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array index ");
        int ind = sc.nextInt();

        System.out.println("enter a number by which you want to divide the array number ");
        int num = sc.nextInt();

        try {
            System.out.println("the value at the index you entered is  : "+marks[ind]);
            System.out.println("the result is  : "+marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurred :");
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("index out of bound :");
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println("Input mismatch ( wrong input ) error occurred ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other error occurred ");
            System.out.println(e);
        }






    }




}
