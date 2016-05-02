
public class Parttime extends Employee {
	protected double hourly;
	protected String days;
	
	public Parttime(String positionIn, String firstNameIn, String lastNameIn, 
			int eidIn, double hourlyIn, String daysIn){
		super(positionIn, firstNameIn, lastNameIn, eidIn);
		hourly = hourlyIn;
		days = daysIn;
	}
	public void setHourly(double hourlyIn){
		hourly = hourlyIn;
	}
	public void setDays(String daysIn){
		days = daysIn;
	}
	public double getHourly(){
		return hourly;
	}
	public String getDays(){
		return days;
	}
	//To-String Method
	public String toString(){
		return super.toString() + " " + hourly + " " + days;		
	}
}
