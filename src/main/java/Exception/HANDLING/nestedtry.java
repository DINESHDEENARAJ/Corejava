package Exception.HANDLING;

public class nestedtry {
    public static void main(String[] args)
    {
        try
        {
            try  //1
            {
                System.out.println("one");
                int a = 40 / 0;                                             // a for arithmatic
            }

            catch (ArithmeticException e) //1
            {
                System.out.println(e);
            }
            try  //2
            {
                int s[] = new int[4];
                s[8] = 2;
            }
            catch (ArrayIndexOutOfBoundsException e) //2
            {
                System.out.println(e);
            }
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Deena and Priya");
    }
}


