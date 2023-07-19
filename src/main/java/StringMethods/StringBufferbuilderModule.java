package StringMethods;

public class StringBufferbuilderModule
{
    public static void main(String[] args)
    {
       StringBuffer ss=new StringBuffer("Annamalai");
        ss.append("Kumar");
        System.out.println(ss);

        System.out.println(ss.capacity());

        ss.insert(2,"aaju");
        System.out.println(ss);

       ss.delete(1,2);
        System.out.println(ss);

        ss.reverse();
        System.out.println(ss);

        //String builder

        StringBuilder d=new StringBuilder("Manojkumar");
        d.append("Priya");
        System.out.println(d);

        d.insert(2,"aaju");
        System.out.println(d);

        d.delete(1,2);
        System.out.println(d);

        d.reverse();
        System.out.println(d);

    }
}
// replace bcz string names only place change but this method have new everything create.
// 012 = annamalai = Aaajunamalai , 1&2 letter was nn
// string buffer ,string builder are mutuable.bcz an change seiyalam.