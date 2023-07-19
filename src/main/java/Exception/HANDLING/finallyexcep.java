package Exception.HANDLING;

public class finallyexcep
{
    public static void main(String[] args)
    {
        try
        {
            int f=80/0;
            String d=null;
            System.out.println(f);
        }
        catch (ArithmeticException ds)
        {
            System.out.println(ds);
        }
        finally
        {
            System.out.println("hii");
            System.out.println("hello");
        }

    }
}
