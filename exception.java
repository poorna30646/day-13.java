import java.util.*;
class fire{
    public static void main(String args[])
    {
        try{
            int d=90/0;
        }catch(ArithmeticException v){
            System.out.println("bad request");

        }
        try{
            int d=90/0;
        }catch(ArithmeticException v){
            System.out.println("catch block is runnig");
        }
        finally{
            System.out.println("finally block was runned");
        }
    }
}