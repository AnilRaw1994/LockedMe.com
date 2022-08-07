	import java.io.File;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.Scanner;

public class Lock {

		public static void main(String[] args) throws IOException {
	System.out.println("Welcome to LockedMe.com");
	System.out.println("Developer - Anil Singh Rawat");
	Scanner sc = new Scanner(System.in);
do {
	System.out.println("\n Please enter your requirement (Sr. No. 1, 2 & 3"+
		"\n 1. Directory" + "\n 2. Details of the User Interface" + "\n 3. Closing the Application");
int sr = sc.nextInt();
	switch(sr){
	case 1:{
		File file = new File ("C:\\Users\\anil.rawat\\eclipse-workspace\\LockedMe.com");
		File[] qty = file.listFiles();
		System.out.println("List of Files Available in Directory");
		Arrays.sort(qty);
		for (int i = 0; i<=qty.length-1;i++) {
		System.out.println(qty[i].getName());	
		}
		String absolute = file.getAbsolutePath(); 
		System.out.println(absolute);
	break;
	}
	case 2:{
		System.out.println("Please enter your requirement (Sr. No. 1, 2, 3 & 4");
		System.out.println(" 1. Add File to the Existing Directory" + "\n 2. Delete File from the Existing Directory" + "\n 3. Searching from Directory" + "\n 4. Back to the Main Menu");
		int sr1 = sc.nextInt();	
		switch (sr1){
		case 1 : {
		System.out.println("Enter File Name to be Added");
		String inputfile = sc.next();
		System.out.println("Enter File Path");
		String path = sc.next();
		inputfile = inputfile + path;
		File file = new File(inputfile);
		if(file.createNewFile()) {
		System.out.println(inputfile + " "+ "file Created Successfully");
			}else {
		System.out.println(inputfile + " file not Created Successfully");
			}
		String absolute = file.getAbsolutePath(); 
		System.out.println(absolute);
		break;
		    }
		case 2 : {
			System.out.println("Enter File Name to be Deleted");
			String inputfile = sc.next();
			System.out.println("Enter File Path");
			String path = sc.next();
			//Case Sensitive
			//ANIL Anil
			
			inputfile = inputfile + path;
			File file = new File(inputfile);
			try {if(file.delete()) {
			System.out.println(inputfile + " "+ "file Deleted Successfully");
				}else {
			System.out.println(inputfile + " file not Deleted Successfully");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
					String absolute = file.getAbsolutePath(); 
			System.out.println(absolute);
			break;
			    }
		case 4 : {
			System.out.println("Navigation back to Main Menu");
			continue;
			    }
		}
		   }
	case 3:{
	System.out.println("Application Closed");
	break;
	}
	}
	  
}while (true);

	     }
		}
	 



