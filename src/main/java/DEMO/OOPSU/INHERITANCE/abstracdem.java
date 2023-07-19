package DEMO.OOPSU.INHERITANCE;

abstract class employ
{
    abstract void production();
}
class company extends employ
{
    void production()
    {
        System.out.println("make");
    }
    /*
    void material()
    {
        System.out.println("raw");
    }
/*
     void land()
     {
        System.out.println("to live"); // any method create and use seilam
      }*/
}
public class abstracdem           
{
    public static void main(String[] args)
    {
       company dc=new company();
        dc.production();
      //  dc.material();
       // dc.land();
    }
}
