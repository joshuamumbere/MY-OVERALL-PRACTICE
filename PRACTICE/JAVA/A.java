public class A {
    public static void main(String[] args) {
        B(new Student());
    }
    public static void B(Object obj){
        System.out.println(obj.toString());
    }
}

