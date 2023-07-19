package DEMO.OOPSU.INHERITANCE;

class mech
{
    void ddd()
    {
        for (int i=0;i<3;i++)
        {
            System.out.println("lll");
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
class eee extends mech
{
    void sss()
    {
        for (int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}

public class thrd
{
    public static void main(String[] args)
    {
        eee ds=new eee();
        ds.sss();
        ds.ddd();
    }
}
