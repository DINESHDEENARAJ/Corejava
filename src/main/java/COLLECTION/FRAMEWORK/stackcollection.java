package COLLECTION.FRAMEWORK;

import java.util.Iterator;
import java.util.Stack;

public class stackcollection
{
    public static void main(String[] args)
    {
        Stack<String>ss=new Stack<String>();
        ss.push("alpha");
        ss.push("beta");
        ss.push("gamma");
        ss.push("colors");

        //ss.peek();
        //ss.isEmpty();
        //ss.pop();
       // ss.pop();
       // ss.add("mark");
        //ss.remove(0);

        Iterator<String>ii=ss.iterator();
        while (ii.hasNext())
        {
            System.out.println(ii.next());
        }
    }
}






// stack means last in 1st find out. q mean as 1st in 1st element find out.

//2 operation in stack. 1.push (adding emement)  2.pop(delet the element) :pop has last la irunthu delete seiyum.
