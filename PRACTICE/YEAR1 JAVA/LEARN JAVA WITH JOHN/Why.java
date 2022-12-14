import java.util.Scanner;

public class Why {
    // int Number=10;
    public void Education(int Number,int retake){
        System.out.println("I would go back to school for as many as " +Number+" times");
        class Whying2{
            // int retake=2;
        public void Units(int retake){
            System.out.println("The highest number of retakes should be " +retake +"times");
            System.out.println(Number);
        }
        }
        Whying2 x=new Whying2();
        x.Units(retake);
    }
    public static void main(String[] args) {
        // System.out.println(retake);
        Why p =new Why();
        Scanner y=new Scanner(System.in);
        System.out.println("enter number :");
        int num=y.nextInt();
        System.out.println("enter retake :");
        int ret=y.nextInt();
        p.Education(num,ret);
    }
}
