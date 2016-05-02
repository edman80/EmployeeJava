
public class Fulltime extends Employee {
	protected String department;
	
	public Fulltime(String positionIn, String firstNameIn, String lastNameIn, int eidIn, String departmentIn){
		super(positionIn, firstNameIn, lastNameIn, eidIn);
		department = departmentIn;
	}
	public void setDepartment(String departmentIn){
		department = departmentIn;
	}
	public String getDepartment(){
		return department;
	}
	//To-String Method
	public String toString(){
		return super.toString() + " " + department;		
	}	
}
