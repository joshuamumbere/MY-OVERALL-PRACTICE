class Intern extends X{
    public static void main(String[] args){
        Intern obj = new Intern();
                String obj1 = "JOSHUA";//this is kept in the string constant pool 
        String obj2 = new String("JOSHUA");//this is kept in the heap memory
    System.out.println(obj1==obj2);
    String obj3 = new String("JOSHUA");
    System.out.println(obj2==obj3);
    String obj4= "JOSHUA";
    System.out.println(obj1==obj4);
        System.out.println(obj1==obj2.intern());// here the jvm will check the heap memory for any bject containing the same string value 
        System.out.println(obj.subt(9,4));
    }
}