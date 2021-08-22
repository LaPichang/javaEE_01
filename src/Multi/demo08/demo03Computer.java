package Multi.demo08;

public class demo03Computer {

    public void powerOn(){
        System.out.println("笔记本开机");
    }

    public void powerOff(){
        System.out.println("笔记本关机");
    }

    public void UseDevice(demo03USB usb){
        usb.Open();
        if(usb instanceof demo03Mouse){
            demo03Mouse mouse = (demo03Mouse) usb;
            mouse.Use();
        }
        if(usb instanceof demo03Keyboard){
            ((demo03Keyboard) usb).Use(); //不建立新的对象完成向下转型
        }
        usb.Shut();
    }
}
