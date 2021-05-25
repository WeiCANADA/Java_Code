package day1_Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonDemo {
    public static void main(String[] args) {
        //创建Frame
        Frame frame = new Frame("My" + " Frame");
        //设置frame 属性 he layout
        frame.setBounds(400, 200, 400, 200);
        frame.setLayout(new FlowLayout());

        //设置窗口侦听
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //创建Button 实例
        Button button = new Button("try");
        //设置button 侦听
        button.addActionListener(e -> System.out.println("试试就试试"));
        //将button 加入 frame
        frame.add(button);

        //设置window可见
        frame.setVisible(true);
    }
}
