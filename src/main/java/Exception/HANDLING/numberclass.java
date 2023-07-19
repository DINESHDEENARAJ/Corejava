package Exception.HANDLING;

public class numberclass
{
    public static void main(String[] args)
    {
        {
            try
            {
               String d="book" ;
               int s=Integer.parseInt(d);
            }
            catch (NumberFormatException A)
            {
                System.out.println(A);
            }
        }
    }
}
