package MULTITHREAD;
class van
{
    void man()
    {
        for (int i=1;i<5;i++)
        {
            System.out.println("Dhenna");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class bus extends van
{
    void human()
    {
        for (int i=1;i<8;i++)                                      //i=0,i<8 has 1-8 print
        {
            try
            {
                Thread.sleep(4000);                                // 1000 has 1 second, 4000 has 4 second
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
public class Threadsleep {
    public static void main(String[] args) {
        bus bb = new bus();
        bb.man();
        bb.human();
    }
}

// try catch vara sleep la red clr line visible.cursor ha athu mela click red clr indicate agum athu click -
//- 2 option varum athula surround by try catch ha click.