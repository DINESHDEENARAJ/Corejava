package ARRAYY;

import java.util.Arrays;

public class bubbleshoot   //accending, deacending
{
    public static void main(String[] args)
    {
        int ar[] = {5,10,12,15,20,22,32,30,34,40,45,51,57,60};  //for small to large

        for (int i=0;i<ar.length;i++)
        {
            for (int j=0;j<ar.length-i-1;j++)
            {
                if (ar[j]>ar[j+1])
                {
                    int swap=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=swap;
                }
            }

        }
        System.out.println(Arrays.toString(ar));
        //System.out.println("s");

    }
}
