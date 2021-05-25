package threadDemo.practice_ticket.youhua;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class SetTicket implements Runnable{
    private Tickets tickets;

    public SetTicket(Tickets tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run() {
        Properties properties = new Properties();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入电影名称:");
        tickets.movieName = scanner.nextLine();
        System.out.println("请输入总票数:");
        tickets.total = scanner.nextLine();
        properties.setProperty(tickets.movieName, tickets.total);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("tickets");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            properties.store(fileWriter, Thread.currentThread().getName());
            if (fileWriter != null) {
                fileWriter.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
