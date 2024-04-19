package Exception_handelling;

import java.util.Scanner;

public class Nested_tryCatch {

    public static void main(String[] args) {

        int markss[] = new int[3];
        markss[0] = 11;
        markss[1] = 9;
        markss[2] = 10;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println("enter a value for choosing a index ");
            int ind = sc.nextInt();
            //  BELOW IS HOW YOU WRITE NESTED TRY CATCH !!!
           try {
             System.out.println("Welcome :) ");

                try {
                System.out.println("value at chosen index is : "+markss[ind]);
                flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sorry this index doesn't exits");
                System.out.println("Exception in level 2  ");
                }
            }
           catch (Exception e) {
            System.out.println("Exception in level 1 ");
            }
        }
        System.out.println("Thank you for using my program  ");
    }
}
