package Exception.HANDLING;

import java.lang.reflect.Array;

public class trycatch
{
    public static void main(String[] args)
    {
        try
        {
            int d[]=new int[10];
            d[12]=40;
            System.out.println(d);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("DS");
        }

    }
}
