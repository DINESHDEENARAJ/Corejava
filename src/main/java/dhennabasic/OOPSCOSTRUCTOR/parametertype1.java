package dhennabasic.OOPSCOSTRUCTOR;

public class parametertype1 // parameter another type ,same parameter method .but mention in "THIS".
{
    int rollno;
    String cname;
    String cdept;
    String location;

    public parametertype1(int rollno, String cname, String cdept, String location)
    {
        this.rollno= rollno ;
        this. cname = cname;
        this.cdept = cdept;
        this.location = location;
    }

    public void print()
    {
        System.out.println(rollno + "\n" + cname + "\n" + cdept + "\n" + location); //  space "\n"
    }

    public static void main(String[] args)
    {
        parametertype1 pp = new parametertype1(123,"SD","ece","ngv");
        pp.print();

        parametertype1 pp1 = new parametertype1(143, "Annamalai", "CSE", "coimbatore");
        pp1.print();

       /* parameter cs=new parameter(123,"mm","mec","mettur");
        cs.print();*/

    }
}