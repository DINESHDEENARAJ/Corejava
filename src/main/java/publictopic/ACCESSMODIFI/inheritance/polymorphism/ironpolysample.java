package publictopic.ACCESSMODIFI.inheritance.polymorphism;
class silver
{
 int hardmetel()
 {
     return 150;
 }
}

class mild extends silver
{

    int hardmetel()
    {
        return 500;
    }
}

public class ironpolysample extends silver
{
    int hardmetel()
    {
        return 750;
    }

    public static void main(String[] args)
    {
        silver ddss=new silver();
        System.out.println("rate:"+ddss.hardmetel());
        ddss=new mild();
        System.out.println("rate:"+ddss.hardmetel());
        ddss=new ironpolysample();
        System.out.println("rate:"+ddss.hardmetel());

    }
}

