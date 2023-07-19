package dhennabasic.controlstatementsif.scannerclass;

import java.util.Scanner;

public class scannersample1
{
    public static void main(String[] args)
    {
         Scanner s= new Scanner(System.in);
       System.out.println("enter name1");

        String name1=s.nextLine();
        System.out.println("name is:"+name1);
        System.out.println("enter age :");

        int a=s.nextInt();
        System.out.println("age is :"+a);
        System.out.println("enter name 2");

         String names=s.next();
       System.out.println("name is:" + names);


    }
}

