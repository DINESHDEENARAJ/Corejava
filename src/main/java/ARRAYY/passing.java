package ARRAYY;

public class passing
{
    public  void max(int a[])                                      // passing mean has to maximum highest value visible
    {
        int max=a[0];

           for (int i=0;i>a.length;i++)                                    //this step  not consider for <,>

              if(max>a[i])                                       //to use  > in minimum value.     this is main

                max=a[i];

        System.out.println(max);
    }
    public static void main(String[] args)
    {
        int a[]={787,38,90,5,10,55};
        passing p = new passing();
        p.max(a);
    }
}


