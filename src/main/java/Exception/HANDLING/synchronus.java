package Exception.HANDLING;


class red
{
        void print(int a)
        {
        for (int i=1;i<=5;i++)
        {
        System.out.println(a*i);
        }
        }
        }
public class synchronus
{
    public static void main(String[] args)
    {
        red r=new red();
        r.print(6);
        Thread h= new Thread()
        {
            public void run()
            {

            }
        };
        System.out.println("exit");
    }
}

            //         its an multiple process.
            //         a=6 (a*i=a*1=6  ;  a*i=a*2=12).

