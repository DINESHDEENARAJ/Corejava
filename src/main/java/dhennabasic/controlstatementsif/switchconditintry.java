package dhennabasic.controlstatementsif;

public class switchconditintry
{
    public static void main(String[] args)
    {
        int month=4;
        switch (month)
        {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            default:
                System.out.println("no month");
        }

    }
}
