package dhennabasic;

public class logicaltry
{
    public static void main(String[] args)
    {
        int a=1000;
        short b=1500;
        double c=1250;

        logicaltry user=new logicaltry();
        user.use();

        if (b>a && c<b)// AND =====2 VALUE OK ON ASSIGN THE VALUE
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("wrong");

    }
        if (b>c || c<b)// OR
        {
            System.out.println("s");
        }
        else
        {
            System.out.println("no");
        }
        if (!(c>a == c<b))//NOT
        {
            System.out.println("accept");}
        else
        {
            System.out.println("not accept");
        }
}


    public void use()

    {

    }
    }
