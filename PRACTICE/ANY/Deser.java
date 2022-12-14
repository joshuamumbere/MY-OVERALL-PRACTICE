import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deser {
    int t=5;
    public static void main(String[] args) {
        Serial obj =null;
        
        for (int t=0;t<5;t++){
        try{
            FileInputStream FIS=new FileInputStream("Details.txt");
            ObjectInputStream OIS =new ObjectInputStream(FIS);
            obj=(Serial)OIS.readObject();
            OIS.close();
            FIS.close();
            System.out.println(obj.Name);
            System.out.println(obj.Age);
            System.out.println(obj.Marks);
            System.out.println(obj.School);


        }
        catch(Exception m){
            m.printStackTrace();
        }
    }
    }
}
