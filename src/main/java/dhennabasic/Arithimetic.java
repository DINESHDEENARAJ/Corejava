package dhennabasic;

public class Arithimetic
{
    public void Sam()
    {
        int data=1500;
        int value=500;
        int result= 0;

        result=data+value;
        System.out.println(result);

        result=data-value;
        System.out.println(result);

        result=data*value;
        System.out.println(result );

        result=data/value;
        System.out.println(result);

        result=data%value;
        System.out.println(result);
    }
    public static void main(String[] args) {
     Arithimetic aa= new Arithimetic();
     aa.Sam();
    }
}
