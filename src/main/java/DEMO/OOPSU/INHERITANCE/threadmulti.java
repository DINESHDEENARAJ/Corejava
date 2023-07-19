package DEMO.OOPSU.INHERITANCE;


class first extends Thread
{
    public void run()
    {
        for (int i=0;i<=20;i+=2)

            System.out.println("\n even:"+i);
    }
}
class second extends Thread
{
    public void run()
    {
        for (int i=1;i<=5;i+=2)
            System.out.println("\n odd:"+i);
    }
}
public class threadmulti
{
    public static void main(String[] args)
    {
        System.out.println("thrd start");
     first o =new first();
     second p=new second();
     o.start();
     p.start();
        System.out.println("end");
    }
}
