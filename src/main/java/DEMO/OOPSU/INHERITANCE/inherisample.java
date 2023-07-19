package DEMO.OOPSU.INHERITANCE;
 class inherisample
{
    public void fest()
    {
        float salery =4000;
        System.out.println("salery:"+ salery);
    }
}
class mcom extends inherisample
{
    public void function()
    {
        int bonus = 1000;
        System.out.println("bonus:"+ bonus);
    }

    public static void main(String[] args)
    {
        mcom ds= new mcom();
        ds.fest();
        ds.function();
    }
}
