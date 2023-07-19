package publictopic.ACCESSMODIFI.inheritance;
 class oop
{
    public void sslc()
    {
        System.out.println("lower");
    }
}
public class coolg extends oop
{
    public void higher()
    {
        System.out.println("go next");
    }

    public static void main(String[] args)
    {
        coolg ds=new coolg();
        ds.sslc();
        ds.higher();
    }
}

