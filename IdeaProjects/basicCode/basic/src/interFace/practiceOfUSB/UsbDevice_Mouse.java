package interFace.practiceOfUSB;

public class UsbDevice_Mouse implements USB {

    @Override
    public void open() {
        System.out.println("打开USB鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭USB鼠标");
    }
    public void click(){
        System.out.println("鼠标点击");

    }
}
