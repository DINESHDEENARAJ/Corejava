package StringMethods;

public class String1  // it has  surrounding by double quatation.

{
    public static void main(String[] args)
    {
        String aaa="Dhenna";
        System.out.println(aaa);

        char a[]={'d','e','e','n','a'};
        System.out.println(a);                              // is anything variable covert into string.

        String  data=new String("Dhennaaa");
        System.out.println(data);

        String sam=new String(data);
        System.out.println(sam);

        String dd="Kumar";                           //kumar=012345=3rd letter A.
        System.out.println(dd.charAt(3));
    }
}
