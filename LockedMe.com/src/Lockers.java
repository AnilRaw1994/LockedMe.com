import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lockers {
static String Directory;
static File files = new File("C:\\Users\\anil.rawat\\eclipse-workspace\\LockedMe.com");

/* public Lockers() {
files = new File ("C:\\Users\\anil.rawat\\eclipse-workspace\\LockedMe.com");
System.out.print(files);
}*/
	static void mainmenu() throws IOException {
	Scanner sc = new Scanner(System.in);
	System.out.println("\n 1. Directory" + "\n 2. Details of the User Interface" + "\n 3. Closing the Application" + "\n \n Please enter your requirement (Sr. No. 1, 2 & 3)");
	int sr = sc.nextInt();
	switch(sr){
	case 1:{
		//File file = new File ("C:\\Users\\anil.rawat\\eclipse-workspace\\LockedMe.com");
		File[] qty = files.listFiles();
		System.out.println("List of Files Available in Directory");
		Arrays.sort(qty);
		for (int i = 0; i<=qty.length-1;i++) {
		System.out.println(qty[i].getName());	
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
			Lockers.addfiles();
			break;
			}
			case 2: {
			Lockers.deletefiles();
			break;
			}
			case 3: {
			Lockers.searchfiles();
			break;
			}
			case 4: {
			System.out.println("Back to the Main Menu \n");
			Lockers.returntomainmenu();
			break;
			}
				}//Nested Switch ends
			break;}
	case 3: {
		System.out.println("Application Closed");
		System.exit(0);
		break;
		}
		}
		
	sc.close();}
	static void addfiles() throws IOException {
		Scanner sc = new Scanner(System.in);
		//File files = new File("C:\\Users\\anil.rawat\\eclipse-workspace\\LockedMe.com");
		System.out.println("Enter File Name to be Added");
		String inputfile = sc.next();
		inputfile = inputfile + ".txt";
		File file = new File(inputfile);
		if(file.createNewFile()) {
		System.out.println(inputfile + " "+ "file Created Successfully");
			}else 
				{
		System.out.println(inputfile + " file not Created Successfully");
	 }
	sc.close();}
		
	static void deletefiles() throws IOException {
		Scanner sc = new Scanner(System.in);
		//File files = new File("C:\\Users\\anil.rawat\\eclipse-workspace\\LockedMe.com");
		System.out.println("Enter File Name to be Deleted");
		String inputfile = sc.next();
		//File file = new File(inputfile);
		File[] qty = files.listFiles();
		for (int i =0; i<=qty.length-1;i++) {
			System.out.println("");
			if(qty[i].getName()==inputfile) {
				
				System.out.println("File Exists");
			}
			 		//String name = files.getName();
 		//if(name.equals(inputfile)) {
		//file.delete();
		//System.out.println(inputfile + " "+ "file Deleted Successfully");
		//break;
		//}else 
		//{
			//System.out.println(inputfile + " " + "File Not Found");
		//	break;
		  //}
		 }
	   sc.close(); }
	
	static void searchfiles() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter File Name need to be Searched");
	//String inputfile = sc.nextLine();
	//File [] qty = files.listFiles();
	//for (File f : qty) {
		/* if (qty[].getName().equals(inputfile)) {
		System.out.println("File Found at");
		break;
		}else {
			System.out.println("File not Found");
			break;
		 }
		}*/
		sc.close();
		}
	//}
	static void returntomainmenu() throws IOException{
		Lockers.mainmenu();
		}
	
	
public static void main(String[] args) throws IOException {
System.out.println("Welcome to LockedMe.com");
System.out.println("Developer - Anil Singh Rawat");

Lockers.mainmenu();


}
}
