package MULTITHREAD;

class red
{
     void print(int a)
     {
         for (int i=1;i<=5;i++)        // ethuvarai calculate seinum nu setting.for 1 start, 5 finish
         {
             System.out.println(a*i);          //a*i has multiple value.6*2 =12,6*3=18,ippadi 5 vara multiple calculat.
         }
     }
}
public class threadsyncronys                 //a=6,a*1=6
{
    public static void main(String[] args)
    {
        red r=new red();                              //classname  obj.name=new classname
        r.print(6);                                    // 6 for how much of table calculate.
        Thread tt=new Thread()
        {
            public void run()
            {

            }
        };                              //; has ithuvaraikku program and stop.
        System.out.println("exit");
    }
}
