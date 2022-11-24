public class Generic3 {
    public static <Y ,Z> void shouts(Y inputone, Z inputtwo) {//This is a generic method that takes in any two stuff you want to put!!
        System.out.println(inputone+" is my passsion!!");
        System.out.println(inputtwo+" is  not my passsion!!");
    }
    public static void main(String[] args) {
        shouts("Programming" ,"JAVA specifically");
            }
}
