import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        Printer<String> x = new Printer<>("Chelsea The Blues");
        x.print();
        Printer<Integer> y = new Printer<>(256);
        y.print();
        Printer<Double> z = new Printer<>(23.456);
        z.print();
        //you can also use this for creating an array list and you specify what objects should be contained in that specific array forexample below
        ArrayList<String> cats= new ArrayList<>();
        cats.add("josh");
        cats.add("lewis");
        cats.add("mumbere");
        cats.add("asingya");
        cats.add("masamba");
        System.out.println(cats);
    }
}
