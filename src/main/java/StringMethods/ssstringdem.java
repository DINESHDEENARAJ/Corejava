package StringMethods;

public class ssstringdem
{
    public static void main(String[] args)
    {
      /*  String ff="Hello";
        String dd="hello";

        System.out.println(ff.compareTo(dd));
        System.out.println(ff.compareToIgnoreCase(dd));
        System.out.println(ff.compareToIgnoreCase(dd)==0); *///1 false
        StringBuffer ss=new StringBuffer("mobile");
        ss.append("shop");
        System.out.println(ss);

        ss.reverse();
        System.out.println(ss);

        System.out.println(ss.capacity());

        ss.insert(2,"owner");
        System.out.println(ss);

        ss.delete(1,2);
        System.out.println(ss);

        //ss.reverse();
       // System.out.println(ss);

    }
}
