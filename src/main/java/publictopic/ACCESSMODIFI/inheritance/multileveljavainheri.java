package publictopic.ACCESSMODIFI.inheritance;
class bag                                //parent               ///multilevel inheritance
{
    public void laptop()
    {
        System.out.println("multi purpose");
    }
}
class world extends bag
{
    public void system()
    {
        System.out.println("sitting work");
    }
}
class cpu extends world
{
    public void key()
    {
        System.out.println("type");
    }
}
public class multileveljavainheri extends cpu //child clss
{
    public static void main(String[] args)
    {
        cpu dn=new cpu();
        dn.laptop();
        dn.system();
        dn.key();

    }
}
