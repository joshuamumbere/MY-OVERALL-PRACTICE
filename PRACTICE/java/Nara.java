import java.util.*;
import java.util.jar.Attributes.Name;
public class Nara {
    void Conclude(){
        System.out.println("Thank you for Listening");
  }
    public static void main(String[] args) {
        Nara n = new Nara();
        Nara.Hmm h = n.new Hmm();
        h.whynot();
        Scanner why=new Scanner(System.in);
             String Name= why.nextLine();
             System.out.println("I can now conclude that your name is "+ Name);
                           n.Conclude();
        
    }
    public class Hmm{
        void whynot(){
            System.out.println("What is your name");
            
        }
    }
    
}
