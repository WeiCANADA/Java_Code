package day3_Label;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
* window 中 field 只能输入数字
* Label :Input you QQ account
* */
public class LabelDemo {
    public static void main(String[] args) {
        //frame
        Frame frame = new Frame("only numbers, but try!");
        //set frame
        frame.setLayout(new FlowLayout());
        frame.setBounds(400, 200, 400, 300);

        //filed
        TextField tf = new TextField(40);
        Label label = new Label("Input you QQ account");

        Component add = frame.add(tf);
        frame.add(label);

        //add keyListener
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if((ch >= '0' && ch <= '9')){
                    e.consume();
                }
            }
        });
    }
}
