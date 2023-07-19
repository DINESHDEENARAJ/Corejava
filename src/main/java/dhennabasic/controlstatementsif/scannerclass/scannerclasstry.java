package dhennabasic.controlstatementsif.scannerclass;

import java.util.Scanner;


    public class scannerclasstry
    {
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("enter valid");

            String value=s.nextLine();                        // any use for short value=s.nextshort();
                                                            // string only use for stringline

            System.out.println("enter valid:" + value);
            System.out.println("enter percen");

            short per=s.nextShort();
            System.out.println("enter percen:" + per);
            System.out.println("enter mark");

            int a=s.nextInt();
            System.out.println("enter mark:" + a);
            System.out.println("entervalue");

            int b=s.nextInt();
            System.out.println("entervalue:" + b);
        }
     }
