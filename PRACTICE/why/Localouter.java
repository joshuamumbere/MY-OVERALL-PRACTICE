public class Localouter {
    public void Mymethod(){
        int num =23;
        class Innering{
            void printNum(){
                System.out.println("Number is :"+ num);
            }
            
        }
        Innering hyd = new Innering();
            hyd.printNum();
    }
    public static void main(String[] args) {
        Localouter objs=new Localouter();
        objs.Mymethod();
    }
}
