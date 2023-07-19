package StringMethods;

public class stringdemo2
{
    public static void main(String[] args)
    {
        String d="bus";

        String d1="Bus";

        String d2=new String("bus");

        System.out.println(d.equals(d2));

        System.out.println(d1.equals(d2));

        System.out.println(d.equalsIgnoreCase(d1));

        System.out.println(d2.compareTo(d));

        System.out.println(d=d1);
    }
}
