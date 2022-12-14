import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.*;
public class Deserializing {
    public static void main(String[] args) {
        Serial se =null;
        try{
            FileInputStream fis = new FileInputStream("files.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            se=(Serial)ois.readObject();
            ois.close();
            fis.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(se.name);
        System.out.println(se.age);
        System.out.println(se.Contact);
    }
}
