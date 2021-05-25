package threadDemo.practice_ticket;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
/*
* 同步方法的锁对象是 this

如果是静态方法，同步方法的锁对象当前class 文件
那么，我们到底使用谁?
如果锁对象是this，就可以考虑使用同步方法。
否则能使用同步代码块的尽量使用同步代码块。


 * */
public class RunnableTicket implements Runnable{
    private final Object obj = new Object();
    @Override
    public void run() {
        //synchronized(对象){需要同步的代码;}
        synchronized (obj) {
            //创建Properties并加载总票数文件
            Properties properties = new Properties();
            FileReader fileReader = null;
            try {
                fileReader = new FileReader("totalTickets");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                properties.load(fileReader);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            //获取总票数
            String totalString = properties.getProperty("total");
            int total = Integer.parseInt(totalString);

            //出票
            Scanner scanner = new Scanner(System.in);
            System.out.println(Thread.currentThread().getName() + "\t" + "tickets Left :" + total + "\n" + "请输入出票张数[1-10]");
            int ticketSale = scanner.nextInt();
            if (ticketSale < total || ticketSale == total) {
                total = total - ticketSale;
                totalString = String.valueOf(total);
                properties.setProperty("total", totalString);

                FileWriter fileWriter = null;
                try {
                    fileWriter = new FileWriter("totalTickets");
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
            } else {
                System.out.println("抱歉,剩余票数不足!");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
