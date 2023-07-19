package MULTITHREAD;

class cycle extends Thread
{
    public void run()
    {
        for (int i=1;i<5;i++)
        {
            System.out.println("running start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class bycycle  extends Thread
{
    public void run()
    {
    for (int i=1;i<5;i++)
    {
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println(i);
    }
    }
}
public class threadisalive
{
    public static void main(String[] args) throws InterruptedException
    {
        cycle hh=new cycle();
        bycycle gg=new bycycle();
       // hh.man();
       // gg.machine();
        hh.start();
        gg.start();
        if(hh.isAlive())
        {
            System.out.println("executed");
        }
      hh.join();
        gg.join();
        if(gg.isAlive())
        {
            System.out.println("Executed the thread");
        }
        System.out.println("Exit");
    }
}
// thread an not constant. so resultla epdi venalum varalam.