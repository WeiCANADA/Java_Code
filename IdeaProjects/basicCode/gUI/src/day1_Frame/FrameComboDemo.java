package day1_Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameComboDemo {
    public static void main(String[] args) {
        //create a frame
        Frame frame = new Frame("Date transfer");
        //set bound and layout
        frame.setLayout(new FlowLayout());
        frame.setBounds(400, 200, 400, 300);
        //设置监听
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //create Components
        Button button = new Button("transfer");
        TextField tf = new TextField("", 20);
        TextArea ta = new TextArea(20, 20);

        frame.add(tf);
        frame.add(button);
        frame.add(ta);
        //set button 监听
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get field text
                String tf_str = tf.getText().trim();
                //clear field
                tf.setText("");
                //append into area
                ta.append(tf_str + "\r\n");

                //获取光标,让光标始终指向field
                tf.requestFocus();
            }
        });

        //set window visible
        frame.setVisible(true);

    }
}
