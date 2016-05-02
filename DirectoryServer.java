import java.util.*;
import java.io.*;

public class DirectoryServer {
	
	
	public static void main(String[] args) throws IOException{
		Scanner commandStream = new Scanner(System.in);
		String command;
		Directory dir = new Directory("Employees.txt");
		System.out.println("Please enter a command: find, add, delete: ");
		while(commandStream.hasNext()){
			
			command = commandStream.next();
			
			if(command.equalsIgnoreCase("find")){
				String lastName;
				System.out.println("Enter the last name of the person you are searching: ");
				lastName = commandStream.next();
				dir.inDir(lastName);
			}
			else if(command.equalsIgnoreCase("delete")){
				int eid;
				System.out.println("Enter the EID of the employee to delete: ");
				eid = commandStream.nextInt();
				dir.del(eid);
			}
			else if(command.equalsIgnoreCase("add")){
				//Instantiate all the parameters to create a new employee object
				String position;
				String firstName;
				String lastName;
				int eid;
				String department;
				String office;
				double salary;
				double hourly;
				String days;
				//Use user input stream to gather data needed to create an employee
				System.out.println("Please enter the position of the employee to add: ");
				position = commandStream.next();
				System.out.println("Please enter the first name of the employee to add: ");
				firstName = commandStream.next();
				System.out.println("Please enter the last name of the employee to add: ");
				lastName = commandStream.next();
				System.out.println("Please enter the eid of the employee to add: ");
				eid = commandStream.nextInt();
				//Different clauses to determine which data values to take. 
				if (position.equalsIgnoreCase("manager") || position.equalsIgnoreCase("clerk")){
					System.out.println("Please enter the department of the employee to add: ");
					department = commandStream.next();
					if(position.equalsIgnoreCase("manager")){
						System.out.println("Please enter the office of the employee to add: ");
						office = commandStream.next();
						System.out.println("Please enter the salary of the employee to add: ");
						salary = commandStream.nextDouble();
						
						Employee temp = new Manager(position, firstName, lastName, eid, department, office, salary);
						dir.dir[dir.dirSize++] = temp;
					}
					else if(position.equalsIgnoreCase("clerk")){
						System.out.println("Please enter the hourly pay of the employee to add: ");
						hourly = commandStream.nextDouble();
						Employee temp = new Clerk(position, firstName, lastName, eid, department, hourly);
					}
				else if(position.equalsIgnoreCase("parttime")){
					System.out.println("Please enter the hourly pay of the employee to add: ");
					hourly = commandStream.nextDouble();
					System.out.println("Please enter the days of the employee to add: ");
					days = commandStream.next();
					Employee temp = new Parttime(position, firstName, lastName, eid, hourly, days);
				}
				}
			}
			System.out.println("Please enter a command: find, add, delete: ");
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter("Employee.txt"));
		for(int i = 0; i<=dir.dirSize-1;i++){
			writer.write(dir.dir[i].toString() + "\n");
		}
		System.exit(0);
	}
}
