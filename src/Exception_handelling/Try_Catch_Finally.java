package Exception_handelling;

/*
Final block contains code which will always  execute whether exception is handled or not .
It is used to execute the code containing instructions to release the system resources, close a connection etc..
*/
public class Try_Catch_Finally {

    public static int math() {
        try {
            int a = 10;
            int b = 2;
            int c = a / b;
            return c;

        } catch (Exception e) {
            System.out.println(e);
        }

        // below is the final block .
        finally {
            System.out.println("Cleaning Up Resources ..End of the Function ");
        }
        return 0;
    }


    public static void main(String[] args) {

        int result = math();
        System.out.println(result);


        // BELOW IS EXAMPLE 2 FOR UNDERSTANDING FINALLY BLOCK
        int a =10 ; int b =1;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am end of the program .");
            }

            b--;
        }
    }
}
