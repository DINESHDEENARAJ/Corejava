package publictopic.ACCESSMODIFI.inheritance;

public class encapstry2
{
    public long name;
    public int number;
    public double value;

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public static void main(String[] args)
    {
        encapstry2 dd=new encapstry2();
        dd.setName(12345678911l);
        dd.setNumber(638026);
        dd.setValue(20000);
        System.out.println(dd.getName());
        System.out.println(dd.getNumber());
        System.out.println(dd.getValue());
    }
}

