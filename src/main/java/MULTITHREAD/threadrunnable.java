package MULTITHREAD;
class animal implements Runnable
{
    public void run()
    {

    }
}
class animal1 extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println("dhenna ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class threadrunnable {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello there ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };                 //; it has used to program ithuvarai stop seiranu mean.
                             //for start to runnable to this colom vara.runnable has separate method.


        animal1 aa= new animal1();

        Thread t1= new Thread(r);

        t1.setName("Dhenna Dhayalan");

        System.out.println(t1.getName());

        t1.setPriority(5);

        System.out.println(t1.getPriority());

        t1.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());

        aa.start();
        t1.start();
    }
}
