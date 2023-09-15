
public class EmployeeTest{
	public static void main (String[] args){
		Professional professional = new Professional ("Jason whitly",2016,2974920,"Professional",5740,22);
		System.out.println("___________________________________________");
		System.out.println("Name of Professional Employee  "+professional.employeeName);
		System.out.println("Weekly Salary  "+professional.calculatingWeeklySalary());
		System.out.println("Health Care Contributions:  "+professional.computingHealthCare());
		System.out.println("Vacation Days Earned this Week:  "+professional.vacationDaysEarned());
		System.out.println("___________________________________________");

		Nonprofessional nonprofessional = new Nonprofessional("Tima MK",2018,7992743,"Nonprofessional",22,36.5);
		System.out.println("___________________________________________");
		System.out.println("Name of Professional Employee  "+nonprofessional.employeeName);
		System.out.println("Weekly Salary  "+nonprofessional.calculatingWeeklySalary());
		System.out.println("Health Care Contributions:  "+nonprofessional.computingHealthCare());
		System.out.println("Vacation Days Earned this Week:  "+nonprofessional.vacationDaysEarned());
        System.out.println("___________________________________________");
	}
}
