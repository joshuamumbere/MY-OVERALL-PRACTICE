public class Inner2  {
    public static void main(String[] args) {
        Inner x =new Inner(){
            void printing(){
                System.out.println("This is what will be printed");
            }
        };
        x.printing();
    }
}
