public class OuterClass {
    String OuterString="Josh";

    //the next line below is of a method of an outer class
    public void hello(){
        System.out.println("Hello" + OuterString);
    }

    //the next line is noe the inner class as shown below
    public class InnerClass{
     String InnerString="Mumbere";   
       public void whatsap(){
        System.out.println("Whatsapp from " + InnerString);
       } 

    }
    public static void main(String[] args) {
     OuterClass o = new OuterClass();
     o.hello();  
     OuterClass.InnerClass n=o.new InnerClass();
     n.whatsap(); 
    
    }
}
