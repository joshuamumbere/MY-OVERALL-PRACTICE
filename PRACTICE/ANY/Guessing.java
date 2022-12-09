import java.util.*;
public class Guessing {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       Random rand = new Random();
       int Randomnumber=rand.nextInt(5) + 1;
       do{
       System.out.println("Please enter a number in between (1-5)");
       int userNumber= scan.nextInt();
       if (userNumber==Randomnumber){
        System.out.println("The guess you made is very right");
        break;
       }
       else if(userNumber>Randomnumber){
        System.out.println("The number is larger than expected");
       }
       else{
        System.out.println("The number is smaller than expected");
       }
     }
     while(true); 
    }
}
