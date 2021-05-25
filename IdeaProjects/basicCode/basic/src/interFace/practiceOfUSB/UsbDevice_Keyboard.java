package interFace.practiceOfUSB;

public class UsbDevice_Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
    public void tybe(){
        System.out.println("键盘输入");

    }
}
