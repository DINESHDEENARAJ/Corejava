package ARRAYY;

import java.util.Scanner;

public class searching
{
    public static void main(String[] args)
    {
        String cast[]={"car","van","bike","lorry","jeep","gear"};
        Scanner d=new Scanner(System.in);
        System.out.println(cast.length);

        System.out.println("my vechile:");

        String my=d.next();

        for (int pos=0;pos<cast.length;pos++)
        {
            if (my.equalsIgnoreCase(cast[pos]))
            {
                System.out.println(my+"vechile found:"+pos);
                return;
            }
        }
        System.out.println("answer not found");
    }
}
