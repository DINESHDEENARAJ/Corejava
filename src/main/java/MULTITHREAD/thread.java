package MULTITHREAD;
class car
{
    void add()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println("hello");
        }
    }
}
class bike extends  car
{
    void add1()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(i);
        }
    }
}
public class thread
{
    public static void main(String[] args)
    {
        bike b= new bike();
        b.add();
        b.add1();

    }
}
