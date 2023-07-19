package publictopic.ACCESSMODIFI.inheritance;
class bus //hierar
{
    public  void volvo()
    {
        System.out.println("New Launching volvo is volvo9600 its bus worth for 2.6 crores");
    }
}
class bus1 extends  bus
{
    public void sleeperbus()
    {
        System.out.println("Its a volvo sleeper best luxary style journey ");
    }
}
class bus2 extends  bus
{
    public void seater()
    {
        System.out.println("SRT BUS VOLVO");
    }
}
public class Hierar  extends bus                                                      //(or bus 2 an apply)
{
    public static void main(String[] args)
    {
        bus2 b = new bus2();
        b.volvo();
        b.seater();

       /*bus1 c=new bus1();
       c.sleeperbus();*/
    }
}
