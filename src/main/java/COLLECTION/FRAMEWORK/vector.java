package COLLECTION.FRAMEWORK;

import java.util.Iterator;
import java.util.Vector;

public class vector
{
    public static void main(String[] args)
    {
        Vector <String>  z= new Vector<String>();
        z.add("rat");
        z.add("cat");
        z.add("mouse");
        z.add("eat");
       // z.clear();

        Iterator<String> i1= z.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}









// v for caps use.
// advantage for store the elements.






