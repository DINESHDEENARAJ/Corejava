package dhennabasic.OOPSCOSTRUCTOR;

public class ndemotrynoargs
{
    short value;
    short num;
    int  call;

    public ndemotrynoargs()
    {
        System.out.println("ball");
    }
    public void bell()
    {
        System.out.println(value+""+num+""+call);
    }

    public static void main(String[] args)
    {
        ndemotrynoargs dsds=new ndemotrynoargs();
        dsds.bell();
    }
}
