import java.util.Scanner;

public class OuterClass1 {
    int Then;
    public void Age(int Then){
        System.out.println("My age by then was "+ Then);
    }
    //take note that a static inner class has a key word 'static'
    //and the way we create its object is differnet from the one for a non static inner class
    public static class InnerClass2{
        int Now;
        public void Age(int Now){
            System.out.println("My age right now is "+ Now);
        }
    }
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("how old were you in 2005?");
        int Then=m.nextInt();
        System.out.println("what is your current age right now?");
        int Now=m.nextInt();
        OuterClass1 out=new OuterClass1();
        out.Age(Then);
        //when it comes to creating an object for the static inner class we do it as follows !!!!
        //In this case we do not use the object of the outer class since the inner class is already static in nature
        OuterClass1.InnerClass2 inn=new OuterClass1.InnerClass2();
        inn.Age(Now);
    }
}
