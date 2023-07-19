package COLLECTION.FRAMEWORK;

import java.util.*;

public class mapp
{
    public static void main(String[] args)
    {
        TreeMap<String,Integer> checked= new TreeMap<String, Integer>();
        checked.put("setting",10);
        checked.put("goal",8);
        checked.put("match",12);
        checked.put("all",15);
        System.out.println(checked);//1

        checked.remove("all");
        System.out.println(checked);//2

        System.out.println(checked.containsKey("setting"));
        System.out.println(checked.containsValue(8));

        List<Character> hh= new LinkedList<Character>();
        hh.add('d');
        hh.add('e');
        hh.add('e');
        hh.add('n');
        hh.add('a');
        Collections.sort(hh);
        System.out.println(hh);
    }
}






// a d e e n for accending order an display.
// if any decending order to overcome an accending value converting.
// map nu syntax use panna athukku thaniya iterator podanum, so treemap use panna simple.