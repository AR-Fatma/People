

public class PersonTest{
	public static void main(String[]args){
		Student student  = new Student ("Tima Salih","300228331",19,"female",
		"hackney PVT","2184089689",3.7,"Software Engineering",2026);
		System.out.println("___________________________________________________");
		System.out.println("Name:  "+student.getName() );
		System.out.println("Social Security Number:  "+ student.getSsn());
		System.out.println("Age:  "+student.getAge());
		System.out.println("Gender:  "+student.getGender());
		System.out.println("Address:  "+student.getAddress());
		System.out.println("Telephone Number:  "+ student.getTelephone());
		System.out.println("GPA:  "+student.getGpa());
		System.out.println("Major:  "+student.getMajor());
		System.out.println("Graduation Year:  "+ student.getYear());
		System.out.println("___________________________________________________");
	}
}