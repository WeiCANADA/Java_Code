package day4_menuBar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class MenuDemo02 {
    public static void main(String[] args) {
        Frame frame = new Frame("First menu");
        frame.setBounds(400, 200, 400, 300);
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
        Menu menuFile1 = new Menu("Change Name");
        MenuItem mi = new MenuItem("Open NotePad");
        MenuItem mi1 = new MenuItem("Good Good Study");
        MenuItem mi2 = new MenuItem("Day Day Up");
        MenuItem mi3 = new MenuItem("Oringnal Title");
        MenuItem mi4 = new MenuItem("Exit System");

        menuFile1.add(mi1);
        menuFile1.add(mi2);
        menuFile1.add(mi3);
        menuFile.add(menuFile1);
        menuFile.add(mi);
        menuFile.add(mi4);
        menuBar.add(menuFile);

        changeName(frame, mi1);
        changeName(frame, mi2);
        oringinal(frame, mi3);
        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runtime r = Runtime.getRuntime();
                try {
                    r.exec("notepad");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        frame.setMenuBar(menuBar);

        frame.setVisible(true);
    }
static void changeName(Frame frame , MenuItem menuItem){
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = frame.getTitle();
                frame.setTitle(menuItem.getLabel());
            }
        });
}
static  void oringinal(Frame frame , MenuItem menuItem){
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("First menu");
            }
        });
}
}