import java.io.*;
import java.util.Scanner;

public class Serial implements Serializable{
    String Name;
    int Marks;
    int Age;
    String School;
    Serial(String x,int y,int z,String m){
        this.Name=x;
        this.Marks=y;
        this.Age=z;
        this.School=m;

    }
    public static void main(String[] args) {
        for (int t=0;t<5;t++){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name :");
        String Name=scan.nextLine();
        System.out.println("What marks did you get :");
        int Marks=scan.nextInt();
        System.out.println("Enter your age please? :");
        int Age=scan.nextInt();
        System.out.println("What school did you attend to ? :");
        String School=scan.next();
        try{
        Serial obj=new Serial(Name,Marks,Age,School);
        FileOutputStream fos=new FileOutputStream("Details.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        fos.close();
             }
             catch(Exception x){
                x.printStackTrace();
             }
    }
}
}
