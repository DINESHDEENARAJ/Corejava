package dhennabasic;

public class testtypecast
{

    public static void main(String[] args)
    {
        double mynumber=638026;
        float myvalue=(float)mynumber;
        int myavarage=(int)mynumber;
        double result=(double) mynumber;

        short ss=123;
        int dd=(int) ss;// large to small  narrowing =datatype with call

        short s=123;
        int d=s;//small to large widening   =direct call

        System.out.println("\nmy number is :"+mynumber);
        System.out.println("\nmy value : " + myvalue);
        System.out.println("\nmy avarage : " +myavarage);
        System.out.println("\n my ss;" + ss);
        System.out.println("\n my dd;" + dd);
        System.out.println("\n my ss;" + ss);
        System.out.println("\n my dd;" + dd);
        System.out.println(dd);

    }

}
