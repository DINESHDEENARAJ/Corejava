package COLLECTION.FRAMEWORK;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist
{
    public static void main(String[] args)
    {
        LinkedList<String> lkl= new LinkedList<String>();        //syntax. //its generic. bcz double side <string> use.

        lkl.add("pen");   //0.its index
        lkl.add("man");   //1
        lkl.add("ball");  //2
        lkl.add("cat");   //3
        lkl.add("catch"); //4                                     // add for method name. for string joinng.

       // lkl.set(0,"hen");
       // lkl.remove(3);

        Iterator<String> ds=lkl.iterator();

        while (ds.hasNext())
        {
            System.out.println(ds.next());
        }
    }
}
// 2 side <string> use seilana ans varum bcz automatic run.