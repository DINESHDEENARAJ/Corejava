package publictopic.ACCESSMODIFI.inheritance;

public class encapstry
{
    public long account;
    public int salery;

    public long getAccount()
    {
        return account;
    }

    public void setAccount(long account)
    {
        this.account = account;
    }

    public int getSalery()
    {
        return salery;
    }

    public void setSalery(int salery)
    {
        this.salery = salery;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public int value;

    public static void main(String[] args)
    {
        encapstry ds=new encapstry();
        ds.setAccount(123456);
        ds.setValue(685);
        ds.setSalery(15000);
        System.out.println(ds.account);
        System.out.println(ds.value);
        System.out.println(ds.salery);
    }
}
