package Exception.HANDLING;

import java.io.IOException;

public class throwclass2
{
    void number(int num)
         throws IOException,ClassNotFoundException
    {
        if (num==1)
        {
            throw  new IOException("s");
        }
        else
        {
            throw new ClassNotFoundException("no");
        }
    }

    public static void main(String[] args)
    {
        throwclass2 j=new throwclass2();

       // j.number(0);  / ippadi pass panna no value.

        try             // parameter pass so this type try catch use.so u get to result. paramtr pass in.io exception,class not found.
        {
           j.number(0);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
