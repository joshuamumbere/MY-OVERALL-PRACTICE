public class A  implements Cloneable{
    int age =18;
    String name ="Arube";

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args)throws CloneNotSupportedException {
        A obj=new A();
        A obj2=(A)obj.clone();
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj2.name="Mike";
        A obj3=(A)obj2.clone();
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        obj3.age=19;
        obj3.name="Mumbere";
        System.out.println(obj3.name);
        System.out.println(obj3.age);
    }
}
