import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lockers {
static File files = new File("C:\\Users\\anil.rawat\\eclipse-workspace\\LockedMe.com");
	static void mainmenu() throws IOException {
	Scanner sc = new Scanner(System.in);
	System.out.println(" 1. Directory" + "\n 2. Details of the User Interface" + "\n 3. Closing the Application" + "\n \n Please enter your requirement (Sr. No. 1, 2 & 3)");
	int sr = sc.nextInt();
	switch(sr){
	case 1:{
		File[] qty = files.listFiles();
		try {Arrays.sort(qty);
		System.out.println("List of Files Available in Directory");
		for (int i = 0; i<=qty.length-1;i++) {
		System.out.println(qty[i].getName());
		}
		}
		catch (Exception e) {
			System.out.println("File Not Exist");
		}
		
	break;
	}
	case 2:{
			int sr1;
			System.out.println(" 1. Add File to the Existing Directory" + "\n 2. Delete File from the Existing Directory" + "\n 3. Searching from Directory" + "\n 4. Back to the Main Menu");
			sr1 = sc.nextInt();
			//Nested Switch Starts
			switch(sr1) {
			case 1:{
					System.out.println("Enter File Name to be Added");
					String inputfile = sc.next();
					Lockers.addfiles(inputfile);
					break;
			}
			case 2: {
					 System.out.println("Enter File Name to be Deleted");
					 String inputfile = sc.next();
					 Lockers.deletefiles(inputfile);
					 break;
			}
			case 3: {
					 System.out.println("Enter File Name need to be Searched");
					 String inputfile = sc.next();
					 Lockers.searchfiles(inputfile);
					 break;
			}
			case 4: {
					 System.out.println("\n Back to the Main Menu");
					 Lockers.returntomainmenu();
					 break;
			}
			default:
				System.out.println("You Enter Invalid No., Please Enter Correct No. (1, 2, 3 & 4)");
				break;
		   }//Nested Switch ends
			  	break;//Case 2 Break
		  }
			case 3: {
					 System.out.println("Application Closed");
					 System.exit(0);
					 break;
	            	}
	       default:   
	    	   System.out.println("You Enter Invalid No., Please Enter Correct No. (1, 2 & 3)");
				break;
					}
	   sc.close();
	  }

//Logic for Adding a File
static void addfiles(String inputfile) throws IOException {
	inputfile = inputfile + ".txt";
	File file = new File(inputfile);
	if(file.createNewFile()) {
		String path = files.getAbsolutePath();
	System.out.println(inputfile + " "+ "file Created Successfully " + path);
		}else 
			{
	System.out.println(inputfile + " file not Created Successfully");
	 }
	}


//Logic for Deleting a Files
static void deletefiles(String inputfile) throws IOException {
	File path = new File (files + "/" + inputfile);
	String [] qty = files.list();
	try {
		 for (String f : qty) {
			if (f.equals(inputfile) && path.delete()) {
				System.out.println("File Deleted");
				return;
				}
		       }
		 System.out.println("File Not Deleted");
	}catch (Exception e) {
		System.out.println("Folder Not Found");
	}
		 
		  }

//Logic for Searching Files
static void searchfiles(String inputfile) {
	String [] qty = files.list();
	try {
		 for (String f : qty){
			 if (f.equals(inputfile)) {
				 System.out.print(f + " : File Found at " + files);
				 return;
			 	}
		 	   }
		 System.out.println("File not Found");
	}catch (Exception e) {
		System.out.println("Folder Not Found");
		
	}
		}	

//Logic for Return to Main Menu
static void returntomainmenu() throws IOException{
		Lockers.mainmenu();
		}
	
	
//Main Method
public static void main(String[] args) throws IOException {
	System.out.println("Welcome to LockedMe.com");
	System.out.println("Developer - Anil Singh Rawat");
	Lockers.mainmenu();
    }
   }