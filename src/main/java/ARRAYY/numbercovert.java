package ARRAYY;

public class numbercovert
{
    public static void main(String[] args)
    {
        try
        {
            String d = "book";
            int s = Integer.parseInt(d);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
