public class Asht {
    
    public static void main(String[] args) {
        InnerAnon obj1=new InnerAnon() {
                   public void getAge() {
              System.out.println("wowing");;
          }
        };  
        obj1.getAge();
      }
}
