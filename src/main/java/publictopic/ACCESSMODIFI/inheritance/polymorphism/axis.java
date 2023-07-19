package publictopic.ACCESSMODIFI.inheritance.polymorphism;
class Bank
{
    int rateofinterest()
    {
        return 8;
    }
}
class sbi extends Bank
{
    @Override
    int rateofinterest()
    {
        return 10;
    }
}

public class axis extends  Bank
{
    @Override
    int rateofinterest()              //rateofinterset as method name
    {
        return 15;
    }

    public static void main(String[] args)
    {
        Bank  b= new Bank();
        System.out.println("Interest IS:"+b.rateofinterest());
        b=new sbi();
        System.out.println("Interest IS:"+b.rateofinterest());
        b=new axis();
        System.out.println("Interest Is:"+b.rateofinterest());
    }
}
// upcasting means objectla irunthu class creat seirathu