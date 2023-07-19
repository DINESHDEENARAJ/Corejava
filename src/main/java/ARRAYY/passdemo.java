package ARRAYY;

public class passdemo
{
    public void min(int a[])
    {
        int min=a[0];
        for (int i=0;i<a.length;i++)
            if (min>a[i])   // > use for minmum vale    .least
                min=a[i];    // < use for maximum value  .highest
        System.out.println(min);
    }

    public static void main(String[] args)
    {
        int a[]={11,21,3,4,5};
        passdemo d=new passdemo();
        d.min(a);
    }
}
