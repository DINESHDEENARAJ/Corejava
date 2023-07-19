package Exception.HANDLING;

public class Arthimetic
{
    public static void main(String[] args)   // its a error taggle method
    {
        int a=100;
        int b=0;
        int c;
        try
        {
            c=a/b;
        }
        catch(ArithmeticException e)                                   // e-expection e are any letter use.
        {
            System.out.println(e);
        }
        System.out.println("Deena");
    }
}
