package ARRAYY;

public class DuplicateArray  // back on repeated number is an duplicate array.
{
    public static void main(String[] args)
    {
        int a[] = new int[] {1,55,22,1,88,65,88,47,60,7,2,65,55};

       // System.out.println("Dupliacte Array:");

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)

            {
                if(a[i]==a[j])

                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
