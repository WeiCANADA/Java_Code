package interFace.practiceOfUSB;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        USB usbDevice_Mouse = new UsbDevice_Mouse();
        computer.useDevice(usbDevice_Mouse);
        USB usbDevice_Keyboard = new UsbDevice_Keyboard();
        computer.useDevice(usbDevice_Keyboard);

        computer.powerOff();
    }
}
