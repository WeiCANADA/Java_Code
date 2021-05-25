package interFace.practiceOfUSB;

public class Computer {
    //开机方法
    public void powerOn(){
        System.out.println("Computer is on");
    }
    public void powerOff(){
        System.out.println("Computer is off");
    }
    public  void useDevice(USB usb){
        usb.open();
        if(usb instanceof UsbDevice_Mouse){
            UsbDevice_Mouse mouse = (UsbDevice_Mouse) usb;
            mouse.click();
        }else if(usb instanceof UsbDevice_Keyboard){
            UsbDevice_Keyboard keyboard = (UsbDevice_Keyboard) usb;
            keyboard.tybe();
        }
        usb.close();

    }
}
