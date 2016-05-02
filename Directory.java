import java.util.*;
import java.io.*;

public class Directory {
	
	final int MAXDIRSIZE = 1024;
	public Employee dir[] = new Employee[MAXDIRSIZE];
	public int dirSize = 0;
	File dirFile = null;
	Scanner dirDataIn = null;
	
	//Employee Data
	String position;
	String firstName;
	String lastName;
	int eid;
	String department;
	String office;
	double salary;
	double hourly;
	String days;
	
	
	Directory(String dirFileName){
		dirFile = new File(dirFileName);
		
		try{
			dirDataIn = new Scanner(dirFile);
		} catch (FileNotFoundException e){
			System.out.println("File " + dirFileName + " not found! Exiting!");
			System.exit(0);
		}
		while (dirDataIn.hasNext()){
			position = dirDataIn.next();
			if(position.equalsIgnoreCase("manager")){
				firstName = dirDataIn.next();
				lastName = dirDataIn.next();
				eid = dirDataIn.nextInt();
				department = dirDataIn.next();
				office = dirDataIn.next();
				salary = dirDataIn.nextDouble();
				Employee temp = new Manager(position, firstName, lastName, eid, department, office, salary);
				dir[dirSize++] = temp;
			}
			else if(position.equalsIgnoreCase("clerk")){
				firstName = dirDataIn.next();
				lastName = dirDataIn.next();
				eid = dirDataIn.nextInt();
				department = dirDataIn.next();
				hourly = dirDataIn.nextDouble();
				Employee temp = new Clerk(position, firstName, lastName, eid, department, hourly);
				dir[dirSize++] = temp;
			}
			else if(position.equalsIgnoreCase("parttime")){
				firstName = dirDataIn.next();
				lastName = dirDataIn.next();
				eid = dirDataIn.nextInt();
				hourly = dirDataIn.nextDouble();
				days = dirDataIn.next();
				Employee temp = new Parttime(position, firstName, lastName, eid, hourly, days);
				dir[dirSize++] = temp;
			}
			else{
				System.out.println("Bad data! Exiting.");
				System.exit(0);
			}
			
		}
	}
	
	public boolean inDir(String name){
		boolean in = false;
		for(int i = 0; i<=dirSize-1;i++){
			if(name.equalsIgnoreCase(dir[i].getLastName())){
				System.out.println("Found: "+ dir[i].toString());
				in = true;
			}	
		}
		if (in != true){
			System.out.println("Not in our directory.");
		}
		return in;
	}
	public void del(int eid){
		int elem = 0;

		for(int i = 0; i<=dirSize-1; i++){
			if(dir[i].getEid() == eid){
				elem = i;
			}
			
		}
		for(int i = 0; i<=dirSize-1; i++){
			dir[i] = dir[i+1];
		}
		dirSize--;
	}

}
