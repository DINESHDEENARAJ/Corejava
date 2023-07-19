package publictopic.ACCESSMODIFI.inheritance.abstraction;

public class flights extends fly
{
    void bird()
    {
        System.out.println("in birds flyyy");
    }

    public static void main(String[] args)
    {
        flights ssd= new flights();
        ssd.bird();
        ssd.butterfly();
    }
}
