public class PersonTest3{
	public static void main(String[]args){
        SalariedEmployee salariedEmployee  = new SalariedEmployee ("Sarah Le","824684682",22,"FEMALE",
		"89 westbrook","682645892638","HUMAN RESORCES","full timer",2022,80300.00);
		System.out.println("___________________________________________________");
		System.out.println("Name:  "+salariedEmployee.getName());
		System.out.println("Social Security Number:  "+ salariedEmployee.getSsn());
		System.out.println("Age:  "+salariedEmployee.getAge());
		System.out.println("Gender:  "+salariedEmployee.getGender());
		System.out.println("Address:  "+salariedEmployee.getAddress());
		System.out.println("Telephone Number:  "+ salariedEmployee.getTelephone());
		System.out.println("Department:  "+salariedEmployee.getDepartment());
		System.out.println("Job Title:  "+salariedEmployee.getJobTitle());
		System.out.println("Year Hired:  "+salariedEmployee.getYearHire());
		System.out.println("Annual Salary:  "+ salariedEmployee.getAnnualSalary());
		System.out.println("___________________________________________________");
    }
}