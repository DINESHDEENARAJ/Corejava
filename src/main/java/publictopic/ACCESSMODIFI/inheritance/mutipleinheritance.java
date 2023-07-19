package publictopic.ACCESSMODIFI.inheritance;
interface cat
{
    void memow();

}
interface  duck
{
    void eating();

}
public class mutipleinheritance implements cat,duck
{
    public static void main(String[] args)
    {
        mutipleinheritance gg=new mutipleinheritance();
        gg.eating();
        gg.memow();

    }

    @Override
    public void memow() {
        System.out.println("Memow the cat ");

    }

    @Override
    public void eating() {
        System.out.println("Eat the duck food ");

    }

}
