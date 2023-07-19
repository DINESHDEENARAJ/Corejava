package dhennabasic.overload.abstrac.type1;
                                                            //changing the Arguments

public class Method1                      //////same name & class,different parameters, diff. arguements
{
    public int sum(int a,int b)
    {
        return a+b; //(ab has arguments)
    }
    public int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        Method1 m = new Method1();
        System.out.println(m.sum(10,20));
        System.out.println(m.sum(50,60,100));
    }
}

