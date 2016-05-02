
public class Employee {
	protected String firstName;
	protected String lastName;
	protected int eid;
	protected String position;
	
	public Employee(String positionIn, String firstNameIn, String lastNameIn, int eidIn){
		firstName = firstNameIn;
		lastName = lastNameIn;
		eid = eidIn;
		position = positionIn;
	}
	//Getter Functions
	public void setFirstName(String firstNameIn){
		firstName = firstNameIn;
	}
	public void setLastName(String lastNameIn){
		lastName = lastNameIn;
	}
	public void setEid(int eidIn){
		eid = eidIn;
	}
	public void setPosition(String positionIn){
		position = positionIn;
	}
	//Setter Functions
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getEid(){
		return eid;
	}
	public String getPosition(){
		return position;
	}
	//To-String Method
	public String toString(){
		return firstName + " " + lastName + " " + eid + " " + position;
	}
}
