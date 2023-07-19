package Exception.HANDLING;

public class throwclass
{
    void vote(int age)
    {
           if (age < 18)
           {
               throw new ArithmeticException("ur not voting");
           }
           else

           {
               System.out.println("voting");
           }
    }


    public static void main(String[] args)
    {

        throwclass dd = new throwclass();
        dd.vote(17);
    }

}


