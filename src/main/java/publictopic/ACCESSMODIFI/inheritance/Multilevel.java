package publictopic.ACCESSMODIFI.inheritance;
class friuts // MULTI LEVEL
{
    public void Apple()
    {
        System.out.println("Apple is the good for health");
    }
}
class vegetables extends  friuts
{
    public void carrot()
    {
        System.out.println("carrot is  good for blood circulation");
    }
}
class dryfruits extends vegetables
{
    public  void cashew()
    {
        System.out.println("Its a high price ");
    }
}
public class Multilevel  extends  dryfruits
{
    public static void main(String[] args)
    {
        Multilevel ds = new Multilevel();
        ds.Apple();
        ds.carrot();
        ds.cashew();

    }
}
