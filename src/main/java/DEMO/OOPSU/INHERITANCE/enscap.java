package DEMO.OOPSU.INHERITANCE;

public class enscap
{
    public long acc;
    public String name;

    public long getAcc()
    {
        return acc;
    }
    public void setAcc(long acc)
    {
        this.acc = acc;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float amount;

    public static void main(String[] args)
    {
        enscap o=new enscap();
        o.setAcc(1234);
        o.setAmount(2);
        System.out.println(o.getAmount());
        System.out.println(o.getAcc());


    }
}
