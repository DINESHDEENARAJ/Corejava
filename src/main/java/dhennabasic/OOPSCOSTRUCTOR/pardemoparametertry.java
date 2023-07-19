package dhennabasic.OOPSCOSTRUCTOR;

public class pardemoparametertry
{
    int cell;
    String wall;
    String paint;
    public pardemoparametertry(int c, String w, String p)
    {
        cell=c;
        wall=w;
        paint=p;
    }
    public void color()
    {
        System.out.println(cell+"\n"+wall+"\n"+paint);
    }

    public static void main(String[] args)
    {
        pardemoparametertry sds=new pardemoparametertry(123,"haaai","hui");
                                                   // (to type an value to auto create on c,w,p)
        sds.color();
    }
}
