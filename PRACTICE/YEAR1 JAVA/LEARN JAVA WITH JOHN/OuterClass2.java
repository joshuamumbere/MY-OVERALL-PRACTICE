import java.util.*;
import java.util.Scanner;

public class OuterClass2 {
    String CUs;
    public String Number(String CUs){
        System.out.println("Let me hope you had "+ CUs + "course units");
class LocalInnerClass{
     private String CUs1;
     public void yah(){
        System.out.println("Hello everyone"+CUs1);
     }
    public String Number1(String CUs1){
        this.CUs1=CUs1;
        System.out.println("Let me hope you can even do more than "+ CUs1 +"course units right now");
        return CUs1;
    }
   
}
LocalInnerClass m=new LocalInnerClass();
m.yah();
m.Number1(CUs);
return CUs+" -wow";    
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of CUs");
        String CUs=sc.nextLine();
        System.out.println("Enter the anticipating CUs1 ");
        String CUs1=sc.nextLine();
        OuterClass2 yeah = new OuterClass2();
        yeah.Number(CUs);
    }
}
