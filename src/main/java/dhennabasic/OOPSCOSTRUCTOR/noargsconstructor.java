package dhennabasic.OOPSCOSTRUCTOR;

public class noargsconstructor  // no arguments means no parameter passing;
{
    int flight;
    String van;
    String car;

    public  noargsconstructor()
    {
        System.out.println("luxury");
    }
    public void display()
    {
        System.out.println(flight+""+van+""+car);// "flight,van,car " double quatation inside pass the value to an result
    }

    public static void main(String[] args)
    {
        noargsconstructor c=new noargsconstructor();
        c.display();
    }
}
