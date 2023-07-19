package dhennabasic.OOPSCOSTRUCTOR;

public class paramtertype1demo
{
    int lap;
    String cpu;
    String monitor;

    public paramtertype1demo(int lap,String cpu,String monitor)
    {
        this.lap=lap;
        this.cpu=cpu;
        this.monitor=monitor;
    }
    public void display()
    {
        System.out.println(lap+""+cpu+""+monitor);
    }

    public static void main(String[] args)
    {

    }
}
