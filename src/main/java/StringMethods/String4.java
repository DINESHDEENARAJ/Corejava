package StringMethods;

import java.util.Locale;

public class String4 {
    public static void main(String[] args)
    {
       String aa1="Kumar";
        String aa2="kumar";
        System.out.println(aa1.compareTo(aa2));
        System.out.println(aa1.compareToIgnoreCase(aa2)==0);
        System.out.println(aa1.equals(aa2));

        //*SubString
        String ss="Ashwinkumar";
        System.out.println(ss.substring(4));                         // 1st 4 letter cut,not mention 0
        System.out.println(ss.substring(0,8));                                //0-8 but 7th letter visible for 0added
        System.out.println(ss.toUpperCase());                                //capital alphapet
        System.out.println(ss.toLowerCase());                               //small alphapet

        //*trim
        String a="sam Aaju";
        System.out.println(a+" kumar ");
        System.out.println(a.trim()+"kumar");                   // remove on space

        String b="notebook";
        System.out.println(b+"pen");
        System.out.println(b.trim()+" pen");
    }
}
