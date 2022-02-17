package phase1Project;


	
	
	
	import java.util.Scanner;
	import java.util.List;

	
		public class Menu_Operation_Handling {
		public static void welcome_Screen_Inputs() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MenuOptions.Display();
					int input = sc.nextInt();

					switch (input) {
					case 1:
						Menu_Operation_Handling.menu_Operation_Handling();
						break;
					case 2:
						businessLvlOperation.display_Files("LockedMe_main");
						break;
					case 3:
						System.out.println("Program exited successfully.");
						running = false;
						sc.close();
						System.exit(0);
						break;
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					welcome_Screen_Inputs();
				} 
			} while (running == true);
		}
		
		public static void menu_Operation_Handling() {
			boolean running = true;
			Scanner sc = new Scanner(System.in);
			do {
				try {
					MenuOptions.display_File_Menu();
					businessLvlOperation.create_MainFolder_IfNot_Present("LockedMe_main");
					
					int input = sc.nextInt();
					switch (input) {
					case 1:
						// File Add
						System.out.println("Enter the name of the file to be added to the \"LockedMe_main\" folder");
						String fileToAdd = sc.next();
						
						businessLvlOperation.create_User_Defined_File(fileToAdd, sc);
						
						break;
					case 2:
						// File/Folder delete
						System.out.println("Enter the name of the file to be deleted from \"LockedMe_main\" folder");
						String fileToDelete = sc.next();
						
						businessLvlOperation.create_MainFolder_IfNot_Present("LockedMe_main");
						List<String> filesToDelete =businessLvlOperation.display_File_Locations(fileToDelete, "LockedMe_main");
						
						String deletionPrompt = "\nSelect index of which file to delete?"
								+ "\n(Enter 0 if you want to delete all elements)";
						System.out.println(deletionPrompt);
					
						int idx = sc.nextInt();
						
						if (idx != 0) {
							businessLvlOperation.delete_User_Defined_Files(filesToDelete.get(idx - 1));
						} else {
							
							// If idx == 0, delete all files displayed for the name
							for (String path : filesToDelete) {
								businessLvlOperation.delete_User_Defined_Files(path);
							}
						}
						

						break;
					case 3:
						// File/Folder Search
						System.out.println("Enter the name of the file to be searched from \"LockedMe_main\" folder");
						String fileName = sc.next();
						
						businessLvlOperation.create_MainFolder_IfNot_Present("LockedMe_main");
						businessLvlOperation.display_File_Locations(fileName, "LockedMe_main");

						
						break;
					case 4:
						// Go to Previous menu
						return;
					case 5:
						// Exit
						System.out.println("Program Terminated successfully.");
						running = false;
						sc.close();
						System.exit(0);
					default:
						System.out.println("Please select a valid option from above.");
					}
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					menu_Operation_Handling();
				}
			} while (running == true);
		}

	}


