package dhennabasic.controlstatementsif;

public class nestedif
{
    public static void main(String[] args)
    {
        int age=30;
        int weight=110;                                    // string or any datatype use but  correct assign method set
        if(age>20)
        {
            if(weight>100)                               //inner and outer condition checking for nestedif.
            {
                System.out.println("hello");
            }
            else
            {
                System.out.println("invalid");
            }
        }
        else
        {
            System.out.println("wrong");
        }
    }
}
