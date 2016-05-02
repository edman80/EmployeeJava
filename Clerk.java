
public class Clerk extends Fulltime {
	protected double hourly;
	public Clerk(String positionIn, String firstNameIn, String lastNameIn, 
			int eidIn, String departmentIn, double hourlyIn){
		super(positionIn, firstNameIn, lastNameIn, eidIn, departmentIn);
		hourly = hourlyIn;
	}
	public void setHourly(double hourlyIn){
		hourly = hourlyIn;
	}
	public double getHourly(){
		return hourly;
	}
	//To-String Method
	public String toString(){
		return super.toString() + " " + hourly;		
	}
}
