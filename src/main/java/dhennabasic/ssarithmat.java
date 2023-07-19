package dhennabasic;

public class ssarithmat
{
    static int value=100;
    int ticketprice=550;

    public void dhenna() //local
    {
        int a=50;
        System.out.println("a is:" + a);
        System.out.println("ticketprice:" + ticketprice);//global
    }

    public static void main(String[] args)
    {
        int data=78;
        System.out.println("data is:" +data);
        System.out.println("value:"+ value);// static

        ssarithmat s= new ssarithmat();
        s.dhenna();
    }
}
