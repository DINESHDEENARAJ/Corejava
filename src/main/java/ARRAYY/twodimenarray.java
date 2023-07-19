package ARRAYY;

public class twodimenarray
{
    public static void main(String[] args)
    {
        int a[][] = {{1,2, 3,4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};


        //int b[][]={{1,8,4},{4,8,7},{2,3,6},{8,8,8}};
        //for (int i = 0; i < 3; i++)
        //for (int j = 0; j < 3; j++)

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.println(a[i][j]);
            }

            System.out.println("sd");                 //  space create. if not mention has no space

        }
    }
}