public class Generic_two {
     public static void main(String[] args) {
        shout("chelsea");
        shout(143);
        shout(55.34576);
     }
     private static  <X> void shout(X thingtoshout){//this is a generic method in java
        System.out.println(thingtoshout + "!!!!!!!!!!");
     }
}
