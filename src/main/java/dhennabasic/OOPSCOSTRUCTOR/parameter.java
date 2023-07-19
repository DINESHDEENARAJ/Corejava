package dhennabasic.OOPSCOSTRUCTOR;

public class parameter           //parameter means use parameters.
{                                //many method use seilam.
    int rollno;
    String cname;
    String cdept;
    String location;
    public   parameter( int r,String cn,String cd,String loc)
    {
        rollno=r;
        cname=cn;
        cdept=cd;
        location=loc;
    }
    public void print()
    {
        System.out.println(rollno+ ""+ cname+ ""  + cdept +  "" +location); //  space "\n"
    }
    public static void main(String[] args)
    {
        parameter pp= new parameter(123, "Dhenna","MECH","salem");
        pp.print();

        parameter pp1= new parameter(143,"Annamalai","CSE","coimbatore");
        pp1.print();

       /* parameter cs=new parameter(123,"mm","mec","mettur");
        cs.print();*/
    }
}
