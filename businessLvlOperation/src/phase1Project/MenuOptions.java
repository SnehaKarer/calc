package phase1Project;

public class MenuOptions {
	
	public static void welcome_Screen(String appName, String developerName) {
		String ApplicationDetails = String.format(	
				
				"<---------------------Welcome to %s.com--------------------->\n\n" 
				+ "          This application was developed by %s.\n\n"
				
				+"______________________________\n", appName, developerName);
		String ApplicationFunctionality = 
				"                   THIS APPLICATION IS USED FOR \n\n"
				+ "I.   Retrieve all files from the \"LockedMe_main\" folder in assinding order.\n"
				+ "II.  Add files in \"LockedMe_main\" folder.\n"
				+ "III. Delete files from \"LockedMe_main\" folder.\n"
				+ "IV.  Search files in the \"LockedMe_main\" folder.\n"
				+ "\nPlease provided valid file name while performing search or delete operation on files.\n"
				+"______________________________\n\n";
		System.out.println(ApplicationDetails);

		System.out.println(ApplicationFunctionality);}
	public static void Display() {
		String menu = "\n\nSelect the operation that you want to perform........ \n\n"
				+ "1. Display menu for File operations\n"
				+ "2. Retrieve all files inside \"LockedMe_main\" folder\n" 
				+ "3. Exit from the program \'EXIT\'\n"
				+"______________________________\n\n";
		System.out.println(menu);

	}

	public static void display_File_Menu() {
		String file_Menu = "______________________________ "
				+ "\n\nSelect the option number you want to perform and press Enter \n\n"
				+ "1. Add a file to \"LockedMe_main\" folder\n" 
				+ "2. Delete a file from \"LockedMe_main\" folder\n"
				+ "3. Search for a file from \"LockedMe_main\" folder\n" 
				+ "4. Show Previous Menu\n" 
				+ "5. Exit program\n"
				+"______________________________\n";

		System.out.println(file_Menu);
	}



}
