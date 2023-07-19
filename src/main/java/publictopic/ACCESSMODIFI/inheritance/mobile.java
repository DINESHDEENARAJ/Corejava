package publictopic.ACCESSMODIFI.inheritance;
class sample
{
    public  void oopsample()
    {
        System.out.println("hello there!");
    }
}
public class mobile  extends  sample
{
    public void model()
    {
        System.out.println("IPHONE14 PRO");
    }

    public static void main(String[] args) {
        mobile m = new mobile();
        m.model();
        m.oopsample();
    }
}
