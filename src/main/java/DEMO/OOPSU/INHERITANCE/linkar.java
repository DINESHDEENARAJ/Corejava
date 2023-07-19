package DEMO.OOPSU.INHERITANCE;

import java.util.Iterator;
import java.util.LinkedList;

public class linkar
{
    public static void main(String[] args)
    {
        LinkedList<String> ll= new LinkedList();
        ll.add("jj");
        ll.add("k");
        ll.add("m");
        ll.add("h");
        ll.set(0,"ds");
        Iterator<String>c=ll.iterator();
        while (c.hasNext())
        {
            System.out.println(c.next());
        }
    }
}
