package publictopic.ACCESSMODIFI.inheritance;
class chair
{
    public void sofa()
    {
        System.out.println("its an comfortable");
    }
}
class stool extends chair
{
    public void wood()
    {
        System.out.println("its an high price");
    }
}
class plastic extends chair
{
    public void polyplastic()
    {
        System.out.println("its an not long life");
    }
}
public class hierarsample extends chair
{
    public static void main(String[] args)
    {
     plastic p = new plastic();
     p.sofa();
     p.polyplastic();
    }
}
