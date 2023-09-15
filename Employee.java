abstract class Employee{
	protected String employeeName;
	protected int yearHired;
	protected long employeeID;
	protected String employeeType;

	public Employee(String employeeName, int yearHired, long employeeID, String employeeType){
		this.employeeName = employeeName;
		this.yearHired    = yearHired;
		this.employeeID   = employeeID;
	}
	public String getEmployeeName(){
		return employeeName;
	}
	public int getYearHired(){
		return yearHired;
	}
	public long getEmployeeID(){
		return employeeID;
	}
	public abstract double calculatingWeeklySalary();
	public abstract double computingHealthCare();
	public abstract int vacationDaysEarned();
}
class Professional extends Employee{
	private double monthlySalary;
	private int vacationDays;

	public Professional (String employeeName, int yearHired, long employeeID,String employeeType,
		double monthlySalary,int vacationDays){
		super(employeeName, yearHired, employeeID,"Professional");
		this.monthlySalary = monthlySalary;
		this.vacationDays  = vacationDays;

	}
	public double calculatingWeeklySalary(){
		return monthlySalary/4;
	}
	public double computingHealthCare(){
		return monthlySalary*0.17;
	}
	public int vacationDaysEarned(){
		return vacationDays/12;
	}

}
class Nonprofessional extends Employee{
	private double hourlyRate;
	private double hoursWorked;

	public Nonprofessional(String employeeName, int yearHired, long employeeID,String employeeType,double hourlyRate,
		double hoursWorked){
		super (employeeName, yearHired, employeeID,"Nonprofessional");
		this.hourlyRate= hourlyRate;
		this.hoursWorked=hoursWorked;

	}
	public double calculatingWeeklySalary(){
		return hourlyRate*hoursWorked;
	}
	public double computingHealthCare(){
		return hourlyRate*hoursWorked*0.08;
	}
	public int vacationDaysEarned(){
		return (int) (hoursWorked/35);
	}
}
