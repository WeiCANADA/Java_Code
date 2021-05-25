package threadDemo.practice_ticket.youhua;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class SellTicket implements Runnable{
    private Tickets tickets;

    public SellTicket(Tickets tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run() {



    }
}
