public class Constructorsjava {
    int m;
    int y;
    String x;
    public Constructorsjava(){
        this.m=25;
        System.out.println("This is the value of m " +m);
    }
    public Constructorsjava(int m, String x){
        this.m=m;
        this.x=x;
        System.out.println(x + "is "+"  aged" + m);
    }
    
    public static void main(String[] args) {
        Constructorsjava obj1=new Constructorsjava();
        Constructorsjava obj2=new Constructorsjava(34, "Mumbere");
        //Take note that we dont need to call a constructor in java
        /*also remember that u can not create constructors that have the same arguments in java */
    }
}
