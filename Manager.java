
public class Manager extends Fulltime {
	protected double salary;
	protected String office;
	
	public Manager(String positionIn, String firstNameIn, String lastNameIn, 
				int eidIn, String departmentIn, String officeIn, double salaryIn){
		super(positionIn, firstNameIn, lastNameIn, eidIn, departmentIn);
		salary = salaryIn;
		office = officeIn;
	}
	public void setSalary(double salaryIn){
		salary = salaryIn;
	}
	public void setOffice(String officeIn){
		office = officeIn;
	}
	public double getSalary(){
		return salary;
	}
	public String getOffice(){
		return office;
	}
	//To-String Method
	public String toString(){
		return super.toString() + " " + office + " " + salary;		
	}
}
