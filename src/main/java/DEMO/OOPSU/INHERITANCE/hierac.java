package DEMO.OOPSU.INHERITANCE;

class hier
{
    public void dd()
    {
        System.out.println("hll");
    }

}
class aa extends hier
{
    public void cc()
    {
        System.out.println("jjj");
    }
}
class bb extends hier
{
    public void bb()
    {
        System.out.println("ggg");
    }
}
public class hierac extends bb
{
    public static void main(String[] args)
    {
        hier ee=new hierac();
        ee.dd();

    }
}