package publictopic.ACCESSMODIFI.inheritance;
class car1
{
    public void engine()
    {
        System.out.println(":sss");
    }
}
class lorry extends car1
{
    public void load()
    {
        System.out.println("HAHAHHAHA");
    }
}
class  truck extends  lorry
{
    public void JCB()
    {
        System.out.println("Loads venicle");
    }
}
public class multileveldsample  extends truck
{
    public static void main(String[] args)
    {
        multileveldsample m = new multileveldsample();
        m.engine();
        m.load();
        m.JCB();

    }
}
