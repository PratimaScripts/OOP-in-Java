package unit_03;

public class OOPS {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Pratima";
		student1.address = "Naxal, kathmandu";
		student1.phoneNumber = 985675 ;
		student1.rollNo = "1";
		student1.getInfo();
		
		Student student2 = new Student();
		student2.name = "Sandhya Sharma";
		student2.rollNo = "2";
		student2.getInfo();	
	}
}
