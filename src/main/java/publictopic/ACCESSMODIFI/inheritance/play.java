package publictopic.ACCESSMODIFI.inheritance;

class oopsam3
{
    public void match()
    {
        System.out.println("play");
    }
}
public class play extends oopsam3
{
    public void game()
    {
        System.out.println("won match");
    }

    public static void main(String[] args)
    {
        play sd=new play();
        sd.match();
        sd.game();
    }
}