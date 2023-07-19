package dhennabasic.overload.abstrac.type1;

public class overloddemo
{
    public int sum(int c,int d)
    {
        return c+d;
    }

    public int sum(int e, int f, int g)
    {
        return e+f+g;
    }

    public static void main(String[] args)
    {
        overloddemo ab=new overloddemo();
        System.out.println(ab.sum(45,56));
        System.out.println(ab.sum(46,56,78));
    }
}

