package COLLECTION.FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;

              //array list same as set list.

public class arraylist
{
    public static void main(String[] args)
    {
        ArrayList <String> arrayList =new ArrayList();

        // its non generic .bcz string use. so string generic.
        // for new arraylist near ku side <string> no use .
        // single side STRING use panna generic .    // double side use panna NON-GENERIC.

        arrayList.add("hii");
        arrayList.add("hello");
        arrayList.add("welcome");
        arrayList.add("bye");

       // arrayList.add("12");

        Iterator<String> s=arrayList.iterator();  //syntax
        while (s.hasNext())
        {
            System.out.println(s.next());
        }
    }
}
