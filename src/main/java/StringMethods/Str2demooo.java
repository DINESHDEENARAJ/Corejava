package StringMethods;

public class Str2demooo
{
    public static void main(String[] args)
    {
        String v1="AAAA";
        String v2="BBBB";

        String v3 = new String("aaaa");
        System.out.println(v3.equals(v1));
        System.out.println(v1.equals(v3));
        System.out.println(v1.equalsIgnoreCase(v3)); // it mean caps A to small a to an equal check.another wise false
        System.out.println();
    }
}
