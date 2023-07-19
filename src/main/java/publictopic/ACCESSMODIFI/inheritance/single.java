package publictopic.ACCESSMODIFI.inheritance;

  class car //parent                   //single inheritance same as heritance
{
    public void gear()
    {
        System.out.println("6 and 5  speed gear box ");
    }
}


public class single  extends car //child
{
    public void singleboy()
    {

        System.out.println("Dhenna is the boy");
    }
    public static void main(String[] args)
    {
        single s = new single();
        s.gear();
        s.singleboy();

    }
}
