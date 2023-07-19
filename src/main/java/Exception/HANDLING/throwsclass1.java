package Exception.HANDLING;

public class throwsclass1
{
    public static void limit(int age) // limit ku pathila value kuda podalam inany name;
    {
        if (age <18)
        {
            throw new ArithmeticException("no valid");
        }
        else
        {
            System.out.println("age is valid");
        }
    }

    public static void main(String[] args)
    {
        limit(12);
        System.out.println("u and me");
    }
}
