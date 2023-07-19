package DEMO.OOPSU.INHERITANCE;
 class newnewooppusu
{
    public void nangai()
    {
        System.out.println("my place");
    }
}
public class city extends newnewooppusu
{
    public void vanavasi()
    {
        System.out.println(" my near");
    }

    public static void main(String[]args)
    {
        city ds=new city();
        ds.nangai();
        ds.vanavasi();
    }
}