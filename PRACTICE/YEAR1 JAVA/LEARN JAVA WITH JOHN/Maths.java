import java.util.*;
public class Maths {
    void m(){
        System.out.println("Maths is my best subject");
    }
    public class Innr{
        void m(){
            System.out.println("Inner class is fucking awesome");
        
        Maths.this.m();}//calling outer class method
    }
    public static void main(String[] args) {
        Maths m = new Maths();
        Maths.Innr i = m.new Innr();
        i.m();
    }
}

