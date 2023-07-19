package DEMO.OOPSU.INHERITANCE;

public class multip
{
    public void pen()
    {
        System.out.println("write");
    }
   public void note()
    {
        System.out.println("paper");
    }
}
class pen extends multip
{
    public static void main(String[] args)
    {
        multip vv=new multip();
        vv.note();
        vv.pen();
    }
}
