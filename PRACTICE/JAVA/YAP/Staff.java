public class Staff extends Person{
	public String EmpNumber;
	public static void main(String[] args){
		Staff  p= (Staff)new Person();
		p.pName="James";
	
		System.out.println("Name: "+p.pName);
		System.out.println("Emp Number: ");
		}
}