package FileHandling;

import java.io.*;
import java.rmi.server.UID;
import java.util.ArrayList;

class data implements Serializable {
    int num;
    String name;
    data(int num,String name){
        this.num=num;
        this.name=name;
    }
}
public class Serialization {
    public static void main(String[] args) throws Exception{
        File file=new File("src/main/java/TextFileHandling/File.txt");
        ArrayList<data> m=new ArrayList<>();
        m.add(new data(1,"raju"));
        m.add(new data(2,"kamal"));
        m.add(new data(3,"joe"));
        ObjectOutputStream write=new ObjectOutputStream(new FileOutputStream(file));
        write.writeObject(m);
        write.close();
    }
}
