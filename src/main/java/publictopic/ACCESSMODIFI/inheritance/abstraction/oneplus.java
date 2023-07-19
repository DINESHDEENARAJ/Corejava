package publictopic.ACCESSMODIFI.inheritance.abstraction;

public  class oneplus extends mobileabstrac {
    void highprice() {
        System.out.println("hifi mob");
    }


    public static void main(String[] args) {
        oneplus dsssd = new oneplus();
        dsssd.highprice();
        dsssd.android();

    }

    @Override
    void keypad() {

    }

    @Override
    void android()
    {
        System.out.println("touch");
    }
}


