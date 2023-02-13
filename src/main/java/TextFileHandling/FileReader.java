package TextFileHandling;

import java.io.*;
import java.util.ArrayList;

public class FileReader {
    public static void main(String[] args) throws Exception{
        File file=new File("src/main/java/TextFileHandling/File.txt");
        ObjectInputStream oi=new ObjectInputStream(new FileInputStream(file));
        ArrayList<data> n=(ArrayList<data>)oi.readObject();
        for(data e:n){
            System.out.println(e.name +" "+e.num);
        }
    }
}
