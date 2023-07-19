package publictopic.ACCESSMODIFI.inheritance;
class oppsampl2
{
    public void system()
    {
        System.out.println("is an world");
    }
}
 public class lap extends oppsampl2
{
    public void keyboard()
    {
        System.out.println("is an typing");
    }

    public static void main(String[] args)
    {
        lap ds=new lap();
        ds.system();
        ds.keyboard();
    }
}