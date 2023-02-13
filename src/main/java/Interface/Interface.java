package Interface;

import java.util.zip.Deflater;

interface Camera{
    void takePicture();
}
interface Communication {
   void call();
}
class MobilePhone implements Camera,Communication{
    public void takePicture(){
        System.out.println("image is captured in smart phone");
    }
    public void call(){
        System.out.println("wait till your call is connected");
    }
}
public class Interface {
    public static void main(String[] args) {
       MobilePhone remote=new MobilePhone();
       remote.call();
    }
}
