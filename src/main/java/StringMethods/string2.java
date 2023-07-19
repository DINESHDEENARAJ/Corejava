package StringMethods;

public class string2                // COMPARISION METHOD.
{
    public static void main(String[] args)
    {
        String s1="Dheena";
        String s2="dheena";

        String s3 =new String("Dheena");

        System.out.println(s1.equals(s1));

        System.out.println(s1.equals(s3));      //!? how false

        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s1));

        System.out.println(s1=s2);

        System.out.println(s1.compareTo(s2));           // true 0,false - for binary convert.


    }
}
