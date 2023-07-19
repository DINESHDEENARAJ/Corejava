package DEMO.OOPSU.INHERITANCE;

import java.util.Arrays;

public class bublsht
{
    public static void main(String[] args)
    {
        int v[]={11,4,7,8,12,1,5,18,20,28};

        for (int i=0;i<v.length;i++)

        {
            for (int j=0;j<v.length-i-1;j++)
            {
                if (v[j] > v[j + 1])
                {
                    int swap = v[j];
                    v[j] = v[j+1];
                     v[j+1]=swap;
                }
            }
        }
        System.out.println(Arrays.toString(v));
    }
}
