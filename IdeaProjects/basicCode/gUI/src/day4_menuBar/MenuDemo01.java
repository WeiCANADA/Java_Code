package day4_menuBar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuDemo01 {
    public static void main(String[] args) {
        Frame frame = new Frame("first menu");
        frame.setBounds(400,200 ,400 ,300 );
        frame.setLayout(new FlowLayout());

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //set bar and Menu
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        MenuItem mi = new MenuItem("Exit System");
        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuFile.add(mi);
        menuBar.add(menuFile);

        frame.setMenuBar(menuBar);

        frame.setVisible(true);
    }
}
