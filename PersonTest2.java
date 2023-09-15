public class PersonTest2{
	public static void main(String[]args){
		HourlyEmployee hourlyEmployee = new HourlyEmployee("John Doe", "123456789", 30, "Male", "123 Main St", "1234567890", "IT Department", "Software Engineer", 2021, 25.0, 40.0, 50.0);
		System.out.println("___________________________________________________");
		System.out.println("Name:  "+hourlyEmployee.getName());
		System.out.println("Social Security Number:  "+ hourlyEmployee.getSsn());
		System.out.println("Age:  "+hourlyEmployee.getAge());
		System.out.println("Gender:  "+hourlyEmployee.getGender());
		System.out.println("Address:  "+hourlyEmployee.getAddress());
		System.out.println("Telephone Number:  "+ hourlyEmployee.getTelephone());
		System.out.println("Department:  "+hourlyEmployee.getDepartment());
		System.out.println("Job Title:  "+hourlyEmployee.getJobTitle());
		System.out.println("Year Hired:  "+hourlyEmployee.getYearHire());
		System.out.println("Hourly Rate: "+hourlyEmployee.getHourlyRate()+"  Worked Hours: "+hourlyEmployee.getHoursWorked()+"  Union Dues: "+hourlyEmployee.getUnionDues());
		System.out.println("___________________________________________________");
	}
}