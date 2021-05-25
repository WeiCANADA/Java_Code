package threadDemo.practice_ticket;

public class RunnableTicketTest {

    public static void main(String[] args) {
        RunnableTicket rt = new RunnableTicket();
        Thread a = new Thread(rt, "A窗口");
        Thread b = new Thread(rt, "B窗口");
        Thread c = new Thread(rt, "C窗口");

        a.start();
        b.start();
        c.start();
    }
}
