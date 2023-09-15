class Person{
	protected String name;
	protected long ssn;
	protected int age;
	protected String gender;
	protected String address;
	protected String telephone;

	public Person (String name,long ssn,int age, String gender, String address,String telephone){
		this.name = name;
		this.ssn =ssn;
		this.age = age;
		this.gender= gender;
		this.address= address;
		this.telephone= telephone;
	}
	public String getName(){
		return name;
	}
	public long getSsn(){
		return ssn;
	}
	public int getage(){
		return age;
	}
	public String getGender(){
		return gender;
	}
	public String getAddress(){
		return address;
	}
	public String getTelephone(){
		return telephone;
	}
	public void setName(String name){
		this.name= name;
	}
	public void setSsn(long ssn){
		this.ssn = ssn;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setGender(String gender){
		this.gender= gender;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}
}
class Student extends Person{
	private double gpa;
	private String major;
	private int year;

	public Student(String name,long ssn,int age, String gender, String address,String telephone,double gpa, String major, int year){
		super(name, ssn, age, gender, address, telephone);
		this.gpa=gpa;
		this.major=major;
		this.year=year;
	}
	public double getGpa(){
		return gpa;
	}
	public String getMajor(){
		return major;
	}
	public int getYear(){
		return year; 
	}
	public void setGpa(double gpa){
		this.gpa=gpa;
	}
	public void setMajor( String major){
		this.major=major;
	}
	public void setYear(int year){
		this.year=year;
	}
}
class Employee extends Person{
	private String department;
	private String jobTitle;
	private int yearHire;

	public Employee(String name,long ssn,int age, String gender, String address,String telephone,String department, String jobTitle, int yearHire){
		super(name, ssn, age, gender, address,telephone);
		this.department=department;
		this.jobTitle=jobTitle;
		this.yearHire=yearHire;	
	}
	public String getDepartment(){
		return department;
	}
	public String getJobTitle(){
		return jobTitle;
	}
	public int getYearHire(){
		return yearHire;
	}
	public void setDepartment(String department){
		this.department=department;
	}
	public void setJobTitle(String jobTitle){
		this.jobTitle=jobTitle;
	}
	public void setYearHire(int yearHire){
		this.yearHire=yearHire;
	}
}
class HourlyEmployee extends Employee{
	private String hourlyRate;
	private String hoursWorked;
	private String unionDues;

	public HourlyEmployee (String name,long ssn,int age, String gender, String address,String telephone,String department, String jobTitle, int yearHire, String hourlyRate, 
		String hoursWorked, String unionDues){
		super (name,ssn, age, gender,  address,telephone, department,  jobTitle, yearHire);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
		this.unionDues=unionDues;
	}

	public String gethourlyRate(){
		return hourlyRate;
	}
	public String getHoursWorked(){
		return hoursWorked;
	}
	public String getUnionDues(){
		return unionDues;
	}
	public void setHourlyRate(String hourlyRate){
		this.hourlyRate=hourlyRate;
	}
	public void setHoursWorked(String hoursWorked){
		this.hoursWorked= hoursWorked;
	}
	public void setUnionDues(String unionDues){
		this.unionDues=unionDues;
	}
}
class SarlyEmployee extends Employee{
	private String annualSalary;

	public SarlyEmployee(String name,long ssn,int age, String gender, String address,String telephone,String department, String jobTitle, int yearHire, String annualSalary){
		super (name,ssn, age, gender,  address,telephone, department,  jobTitle, yearHire);
		this.annualSalary=annualSalary;
	}
	public String getAnnualSalary(){
		return annualSalary;
	}
	public void setAnnualSalary(String annualSalary){
		this.annualSalary= annualSalary;
	}
}
public class Application{
	public static void main(String[]args){
		Person [] individual = new Person [5];
		Student student_1     = new Student ("Tima Salih",300228331,19,"female","hackney PVT","2184089689",3.7,"Software Engineering",2026);
		Student student_2     = new Student ("Hamza Agha",344990283,18,"MALE"," Piccadilly Street","2793824640",3.8,"Computer Science",2027);
		Student student_3     = new Student ("Emma Smith",368924582,20,"Female", "216 Queensway","1829462081",3.5,"Electrical Engineering",2026);
		HourlyEmployee hourlyEmployee_1 = new HourlyEmployee("james williams",286525829,34,"Male","34 West valley ","16329474628","Business and marketing","Manager",2018, "$22","30.5","50");
		SarlyEmployee salaryemployee_1  = new SarlyEmployee ("Sarah Le",824684682,22,"FEMALE","89 westbrook","682645892638","HUMAN RESORCES","full timer",2022,"$80300.00");

		individual [0] = student_1;
		individual [1] = student_2;
		individual [2] = student_3;
		individual [3] = hourlyEmployee_1;
		individual [4] = salaryemployee_1;

		for (Person person: individual){
			System.out.println (person);
			System.out.println("____________________");

		}
	}
}