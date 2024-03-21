package studdentApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("----------- Wel Come TO My Student Application -----------");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Update Student");
			System.out.println("Press 4 to Show Student Data");
			System.out.println("Pree 5 to exit From The Application");
			
			int choice = Integer.parseInt(br.readLine());
			
			
			if(choice == 1) {
				System.out.print("Enter student name : ");
				String name = br.readLine();
				
				System.out.print("\nEnter student mobile number : ");
				String mobile = br.readLine();
				
				System.out.print("\nEnter student city : ");
				String city = br.readLine();
				
				
				// create a student object
				
				StudentData st = new StudentData(name, mobile, city);
				
				boolean b = StudentDao.insertStudentData(st);
				
				if(b) {
					System.out.println("Successfully Added");
					System.out.println();
				
				}
				else {
					System.out.println("Try Once Again");
				}
			}
			
			
			else if(choice == 2) {
				
				System.out.print("Enter Student ID : ");
				int id = Integer.parseInt(br.readLine());
				
				boolean b = StudentDao.deleteStudentData(id);
				
				if(b) {
					System.out.println("Successfully Deleted");
					System.out.println();
					 
				}
			}
			
			
			
			else if(choice == 3) {
				
				System.out.println("Enter Student Id which You Want To Update");
				int id = Integer.parseInt(br.readLine());
				
				System.out.print("Enter student name : ");
				String name = br.readLine();
				
				System.out.print("\nEnter student mobile number : ");
				String mobile = br.readLine();
				
				System.out.print("\nEnter student city : ");
				String city = br.readLine();
				
				
				// create a student object
				
				StudentData st = new StudentData(id, name, mobile, city);
				
				boolean b = StudentDao.updateStudentData(st);
				
				if(b) {
					System.out.println("Successfully Updated");
					System.out.println();
					 
				}
				else {
					System.out.println("Something went wrong");
				}
			}
			
			
			else if(choice == 4) {
				
				StudentDao.dispalyStudentData();
				System.out.println();
				 
				
			}
			
			else if(choice == 5) {
				System.out.println();
				 
				System.out.println("---------------Thanks For Using My Student Application ! ---------------");
				break;
			}
			
		}
	}
}
