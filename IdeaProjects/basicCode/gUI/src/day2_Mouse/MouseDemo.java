package day2_Mouse;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseDemo {
    public static void main(String[] args) {
        //frame
        Frame frame = new Frame("背景色");
        //set frame and layout
        frame.setBounds(400, 200, 400, 300);
        frame.setLayout(new FlowLayout());

        //set window 监听
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //button object
        Button redbutton = new Button("Red");
        Button bluebutton = new Button("Blue");
        Button greenbutton = new Button("Green");
        frame.add(redbutton);
        frame.add(bluebutton);
        frame.add(greenbutton);

        //mouse listener :mouseEntered
        redbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                frame.setBackground(Color.RED);
            }
        });

        bluebutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                frame.setBackground(Color.BLUE);
            }
        });

        greenbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                frame.setBackground(Color.GREEN);
            }
        });

        ///mouse listener :mouseEntered
        redbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                frame.setBackground(Color.WHITE);
            }
        });

        bluebutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                frame.setBackground(Color.WHITE);
            }
        });

        greenbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                frame.setBackground(Color.WHITE);
            }
        });

        frame.setVisible(true);
    }
}
