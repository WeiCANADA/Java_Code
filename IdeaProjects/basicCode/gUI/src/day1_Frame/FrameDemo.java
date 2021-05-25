package day1_Frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {
    public static void main(String[] args) {
        //window object
        Frame f1 = new Frame("Sitan LIU");
        //window 属性
        f1.setBounds(400, 200, 400, 300);
        //显示窗口
        f1.setVisible(true);

        //关闭窗口
        // 		//事件源
        //		//事件：对窗体的处理
        //		//事件处理：关闭窗口(System.exit(0));
        //		//事件监听
        /*f1.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }*/
        //用适配器WindowAdapter改进 侦听
        f1.addWindowListener( new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}

