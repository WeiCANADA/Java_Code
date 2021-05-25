package threadDemo.practice_ticket.youhua;

public class TicketTest {
    public static void main(String[] args) {
        //创建资源
        Tickets tickets = new Tickets();

        //设置和获取的类
        SetTicket setTicket = new SetTicket(tickets);

        //线程类
        Thread t1 = new Thread(setTicket,"SetTickets");

        //启动线程
        t1.start();
    }
}
