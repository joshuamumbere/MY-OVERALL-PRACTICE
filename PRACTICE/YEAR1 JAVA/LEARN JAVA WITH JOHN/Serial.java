import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.*;
public class Serial implements Serializable{
    String name;
    int age;
    String Contact;
    Serial(String n, int a, String c){
        this.name=n;
        this.age=a;
        this.Contact=c;

    }
    public static void main(String[] args) {
        try{
            Serial se =new Serial("Mumbere", 19, "0762729599");
            FileOutputStream fos=new FileOutputStream("files.txt");
            ObjectOutputStream ous=new ObjectOutputStream(fos);
            ous.writeObject(se);
            ous.close();
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

