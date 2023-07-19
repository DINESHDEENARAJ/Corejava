package publictopic.ACCESSMODIFI.inheritance.abstraction;


public class Abstract1  extends bike               // abstract method use

                                                 // class overide use seirom
{
    void fast()
    {
        System.out.println("CAr is speed is high");
    }

    public static void main(String[] args)
    {
        Abstract1 aa= new Abstract1();
        aa.car();
        aa.fast();
    }
}
