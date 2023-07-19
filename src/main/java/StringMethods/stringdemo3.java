package StringMethods;

public class stringdemo3
{
    public static void main(String[] args)
    {
        String ss="system";
        System.out.println(ss.length());

        System.out.println(ss.charAt(5));

        System.out.println(ss.startsWith("s"));

        System.out.println(ss.endsWith("m"));

        String dd="welcome world";
        String replace=dd.replace("welcome","hello");
        System.out.println(replace);
    }
}
