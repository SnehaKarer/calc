package phase1Project;

public class LockedMeMain {
public static void main(String[] args) {
		
		// Create "LockedMe_main" folder if not present in current folder structure
	
	businessLvlOperation.create_MainFolder_IfNot_Present("LockedMe_main");
			
		// Print the welcome screen in the console
			
			MenuOptions.welcome_Screen("LockedMe", "Sneha Karer ");
			
		// Print the main menu for the operation
			Menu_Operation_Handling.welcome_Screen_Inputs();
	}
}


