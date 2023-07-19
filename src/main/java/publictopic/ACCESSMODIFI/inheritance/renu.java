package publictopic.ACCESSMODIFI.inheritance;

class oop2
{
    public void deena()
    {
        System.out.println("mmmmm");
    }
}
public class renu extends oop2
{
    public void mother()
    {
        System.out.println("my mother ");
    }

    public static void main(String[] args)
    {
        renu sd = new renu();
        sd.deena();
        sd.mother();

    }
}
