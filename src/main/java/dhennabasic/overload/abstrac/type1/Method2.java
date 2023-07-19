package dhennabasic.overload.abstrac.type1;
//Changing The Datatype


public class Method2
{
    public int sum(int a)
    {
        return a;
    }
    public  double sum(double  a,double b)
    {
        return a+b;
    }
    public  float sum(float a,float b,float c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        Method2 mm= new Method2();
        System.out.println(mm.sum(15));
        System.out.println(mm.sum(15.5,78.5));
        System.out.println(mm.sum(10,45,80)); // float as convert value as double.
    }
}
