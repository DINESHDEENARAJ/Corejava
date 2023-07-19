package dhennabasic.overload.abstrac.type2.override;

public class name extends number
{
    public void rollnumber()
    {
        System.out.println("student name");
    }

    public static void main(String[] args)
    {
        name gg=new name();
        gg.rollnumber();
        gg.rollnumber();


       /* number dd=new number();
        dd.rollnumber();*/

    }
}
