package Exception.HANDLING;

public class nullpoint
{
    public static void main(String[] args)
    {
        try
        {
            String d = null;
            System.out.println(d.length());
        }
        catch (NullPointerException s)
        {
            System.out.println(s);
        }

        String d = "dinesh";
        System.out.println(d.length());
    }
}
