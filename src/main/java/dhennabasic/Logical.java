package dhennabasic;

public class Logical {
    public void logi()
    {
        int ticket=1350;
        int volvoticket=1500;
        int sleeperticket=1350;
        //AND OR NOT
        //Symbol AND -&&
        //symbol OR-||
        //Symbol NOT-!
        if(ticket>=sleeperticket && volvoticket>=ticket)
        {
            System.out.println("your bus is booked");
        }
        else {
            System.out.println("not valid ");
        }
        if(sleeperticket>=volvoticket || ticket<=volvoticket)
        {
            System.out.println("Your volvo booked ");
        }
        else
        {
            System.out.println("NOT BOOKED");
        }
        if(!(ticket==sleeperticket))//true opp false ;false opp true ;so ans true but false saying.
        {
            System.out.println("True ");
        }
        else {
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Logical ll= new Logical();
        ll.logi();

    }
}
