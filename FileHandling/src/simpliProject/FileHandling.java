package simpliProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String choice,cont = "y";        
        
        while( cont.equalsIgnoreCase("y") ) {        	
        	   System.out.println("\t\t Student Information System\n\n");
        
	        System.out.println("1. Add New Student Details ");
	        System.out.println("2. View All Student Details ");	
	        System.out.println("3. Delete Student Details ");
	        System.out.println("4. Search Specific Details ");
	        System.out.println("5. Update Specific Details ");	        
	    
	        System.out.print("\n");
	        System.out.println("Please enter your choice: ");
	        choice = sc.nextLine();
	        
	        switch (choice) {
			case "1":
				try {
			Add_Student_Details();
		} catch (IOException e) {
			e.printStackTrace();
		}
				break;
			case "2":
				try {
					View_All_Details();
				} catch (IOException e) {
					e.printStackTrace();				}
				break;
			case "3":
				try {
					Delete_Student_Details_ByID();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case "4":
				try {
					Search_Student_Details_byID();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case "5":
				try {
					update_Student_Details_byID();
				} catch (IOException io) {
					io.printStackTrace();
				}
				break;
				
			default:
				System.out.println("Enter the valid input and try again\n");
				break;
			}   	
	        System.out.println("Return to main menu enter \"Y\"\nExit from the program enter \"N\"\n");
	        cont = sc.nextLine();
	       	
        }
        System.out.println("Program terminated successfully.....");

}

  public static void Add_Student_Details() throws IOException {
		
		BufferedWriter BfrWr = new BufferedWriter( new FileWriter("records.txt",true) );
		Scanner sr = new Scanner(System.in);
		
		String ID, name, age, address;
		
		System.out.print("\nEnter the Student ID: ");
		ID = sr.nextLine();
		System.out.print("\nEnter the Student Name: ");
		name = sr.nextLine();
		System.out.print("\nEnter the Student Age: ");
		age = sr.nextLine();
		System.out.print("\nEnter the Student Address: ");
		address = sr.nextLine();    		
		   		
		BfrWr.write(ID+","+name+","+age+","+address);
		BfrWr.flush();
		BfrWr.newLine();
		BfrWr.close();		
	
}
  
public static void View_All_Details() throws IOException {
    	BufferedReader BfrRd = new BufferedReader( new FileReader("records.txt") );
    		
    	String record;
    		
    	System.out.println(" _________________________ ");
    	System.out.println("|	ID		 Name 	    	 Age		        	Address   |");
    	System.out.println(" _________________________ ");
    		
    	while( ( record = BfrRd.readLine() ) != null ) {
    			
    		StringTokenizer st = new StringTokenizer(record,",");
    			
    		System.out.println("|	"+st.nextToken()+"	         "+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"     |");
	
    	}
    		
    	System.out.println(" _________________________");
    	BfrRd.close();    		
    		
    }



public static void Delete_Student_Details_ByID() throws IOException {
    		Scanner srInput =  new Scanner(System.in);
    		String ID, record;
    		
    		
    		File tempDB = new File("records_temp.txt");
    		File db = new File("records.txt");
    		
    		
    		BufferedReader BfrRd = new BufferedReader( new FileReader( db ) );
    		BufferedWriter BfrWr = new BufferedWriter( new FileWriter( tempDB ) );
    		
    		
    		System.out.println("\t\t Delete Student Details\n");
    		
    		System.out.println("Enter the Student ID: ");
    		ID =  srInput.nextLine();
    		
    		
    		while( ( record = BfrRd.readLine() ) != null ) {
    			
    			
    			if( record.contains(ID) ) 
    				continue;
   
    			BfrWr.write(record);
    			BfrWr.flush();
    			BfrWr.newLine();
 
    		}
    		
    		BfrRd.close();
    		BfrWr.close();
    		
    		db.delete();
    		
    		tempDB.renameTo(db);

    }


public static void Search_Student_Details_byID() throws IOException {
    		String ID,record;
    		Scanner srInput = new Scanner(System.in);
    		
    		BufferedReader BfrRd = new BufferedReader( new FileReader("records.txt") );
    		
    		System.out.println("\t\t Search Student Details\n");
    	
    		
    		System.out.println("Enter the Student ID: ");
    		ID = srInput.nextLine();
    		
    		System.out.println(" _____________________ ");
    		System.out.println("|	ID		Name 				Age			Address 		  |");
    		System.out.println(" _____________________ ");
    		
    		while( ( record = BfrRd.readLine() ) != null ) {
    			
    			StringTokenizer st = new StringTokenizer(record,",");
    			if( record.contains(ID) ) {
    				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
    			}
    			
    			
    			
    		}
    		
    		System.out.println("|	                                            	          |");
    		System.out.println(" _____________________ ");
    		
    		BfrRd.close();
    		
    		
    		
    }


public static void update_Student_Details_byID() throws IOException {
    		String newName, newAge, newAddr, record, ID,record2;
    		
    		File db = new File("records.txt");
    		File tempDB = new File("records_temp.txt");
    		
    		BufferedReader BfrRd = new BufferedReader( new FileReader(db) );
    		BufferedWriter BfrWr = new BufferedWriter( new FileWriter(tempDB) );
    		    		
    		Scanner strInput = new Scanner(System.in);
    		
    		System.out.println("\t\t Update Student Details\n\n");   
		/**/		
			System.out.println("Enter the Student ID: ");
	    		ID = strInput.nextLine();	    		
	    		System.out.println(" _____________________ ");
	    		System.out.println("|	ID		Name 				Age			Address 		  |");
	    		System.out.println(" _____________________ ");
	    		
	    		while( ( record = BfrRd.readLine() ) != null ) {
	    			
	    			StringTokenizer st = new StringTokenizer(record,",");
	    			if( record.contains(ID) ) {
	    				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
	    			}
	    			
	    		}	    		
	    		System.out.println("|	                                            	          |");
	    		System.out.println(" _____________________ ");
	    		
	    	BfrRd.close();
		/**/    	   
    		System.out.println("Enter the new Name: ");
    		newName = strInput.nextLine();    		
    		System.out.println("Enter the new Age: ");
    		newAge = strInput.nextLine();  
    		System.out.println("Enter the new Address: ");
    		newAddr = strInput.nextLine();  
    		
    		BufferedReader br2 = new BufferedReader( new FileReader(db) );
    			
    		while( (record2 = br2.readLine() ) != null ) {    			
    			if(record2.contains(ID)) {
    				BfrWr.write(ID+","+newName+","+newAge+","+newAddr);
    			} else {
    			
    				BfrWr.write(record2);	
    			}    			
    			BfrWr.flush();
    			BfrWr.newLine();
    		}
    		
    		BfrWr.close();
    		br2.close();    		
    		db.delete();    		
    		boolean success = tempDB.renameTo(db);    		
    		System.out.println(success);    		
    		
    }
  

}
