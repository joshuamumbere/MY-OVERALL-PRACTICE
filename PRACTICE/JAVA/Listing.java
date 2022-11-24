import java.util.ArrayList;
import java.util.List;

public class Listing {
        public static void main(String[] args) {
        List<String> integerlist = new ArrayList<>();
        integerlist.add("345");
        integerlist.add("joshua");
        PrintList(integerlist);
    }
    public static void PrintList(List<?> mylist) {
        System.out.println(mylist);
    }
}
