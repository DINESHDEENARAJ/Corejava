package DEMO.OOPSU.INHERITANCE;

class lap
{
    public void test()
    {

        {
            System.out.println("written");
        }

    }


}
class moniting extends lap
{
    public void display()
    {
        System.out.println("pad");
    }

}

public class multest extends moniting
{
    public static void main(String[] args)
    {
        multest dd=new multest();
        dd.test();
        dd.display();
    }
}
