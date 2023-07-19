package dhennabasic.controlstatementsif.scannerclass;

import java.util.Scanner;

public class scanner
{
    public static void main(String[] args)

    {
        Scanner s = new Scanner(System.in);
        int data= s.nextInt();
        if(data%2==0)
        {
            System.out.println("even number");
        }
         else
        {
            System.out.println("odd number");
        }
    }
}
