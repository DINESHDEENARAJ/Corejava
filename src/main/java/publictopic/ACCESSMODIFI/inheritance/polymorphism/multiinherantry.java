package publictopic.ACCESSMODIFI.inheritance.polymorphism;
interface van
{
    void heavy();
}
interface bus
{
    void people();
}
public class multiinherantry implements van,bus
{
    public static void main(String[] args)
    {
        multiinherantry sds= new multiinherantry();
        sds.heavy();
        sds.people();
    }
    public void heavy()

    {
        System.out.println("its an heavy vehicle 1000rpm");
    }
    public void people()
    {
        System.out.println("its an people use");
    }
}
