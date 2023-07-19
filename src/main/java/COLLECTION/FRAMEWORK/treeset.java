package COLLECTION.FRAMEWORK;

import java.util.TreeSet;

public class treeset
{
    public static void main(String[] args)
    {
        TreeSet<Character> tre= new TreeSet<Character>();
        tre.add('1');
        tre.add('2');
        tre.add('3');
        tre.add('4');
        tre.add('5');
        tre.add('6');

        tre.addAll(tre);
        System.out.println(tre);

        tre.add('z');
        System.out.println(tre +"this value is treeset value");

        tre.remove('1');
        System.out.println(tre+"remove the particular item, only way of item");

        System.out.println(tre.contains('3'));              // contains mean for s r no

        tre.retainAll(tre);
        System.out.println(tre);
    }
}

// 1 for remove used so 1 no display.