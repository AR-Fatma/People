public class Professional extends SalaryEmployee {
	private int vacationDays;

	public Professional (String employeeName, int yearHired, long employeeID,String employeeType,
		double monthlySalary,int vacationDays){
		super(employeeName, yearHired, employeeID,"Professional");
		this.vacationDays  = vacationDays;

	}
	public double calculatingWeeklySalary(){
		return monthlySalary/4;
	}
	public double computingHealthCare(){
		return monthlySalary*0.17;
	}
	public int getvacationDaysEarned(){
		return vacationDays;
	}

}