import java.util.*;
public class Outer {
    int Age=24;
    void getAge(){
    Age=Age + 10 ;
    System.out.println("Your exact age is " + Age);
    }
    public class Inner{
    void Aging(){
        System.out.println("I think the very fast way is wrong");
        System.out.println("But then you could be older than " + Age);
    }
    }
    public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
    int Nah =m.nextInt();    
    Outer x= new Outer();
    x.getAge();
    Outer.Inner y=x.new Inner();
    y.Aging();
    }
}
