package dhennabasic.overload.abstrac.type2.override;

public class bike extends van
{
    public void car()

    {
        System.out.println("single person use");
    }

    public static void main(String[] args)
    {
        bike b = new bike();
        b.car();
        b.car();



      /*  van c =new van();
        b.car();*/
    }
}
