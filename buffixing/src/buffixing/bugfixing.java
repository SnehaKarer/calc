package buffixing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bugfixing {
	public static void main(String[] args) {
	    System.out.println("\n______________\n");
	    System.out.println("\tWelcome to TheDesk \n");
	    System.out.println("____________");
	    display_Options();

	}
	private static void display_Options() {
	    String[] arr = {"\n1. I wish to review my expenditure",
	            "2. I wish to add my expenditure",
	            "3. I wish to delete my expenditure",
	            "4. I wish to sort the expenditures",
	            "5. I wish to search for a particular expenditure",
	            "6. Close the application"
	    };
	    int[] array1 = {1,2,3,4,5,6};
	    int  lent = array1.length;
	    for(int index=0; index<lent;index++){
	        System.out.println(arr[index]);
	        // display the all the Strings mentioned in the String array
	    }
	    ArrayList<Integer> arrlist = new ArrayList<Integer>();
	    ArrayList<Integer> expenses = new ArrayList<Integer>();
	    expenses.add(1000);
	    expenses.add(2300);
	    expenses.add(45000);
	    expenses.add(32000);
	    expenses.add(110);
	    expenses.addAll(arrlist);
	    System.out.println("\nEnter your choice:\t");
	    Scanner sc = new Scanner(System.in);
	    int  choice =  sc.nextInt();
	    for(int j=1;j<=lent;j++){
	        if(choice==j){
	            switch (choice){
	                case 1:
	                    System.out.println("Your saved expenses are listed below: \n");
	                    System.out.println(expenses+"\n");
	                    display_Options();
	                    break;
	                case 2:
	                    System.out.println("Enter the value to add your Expense: \n");
	                    int value = sc.nextInt();
	                    expenses.add(value);
	                    System.out.println("Your value is updated\n");
	                    expenses.addAll(arrlist);
	                    System.out.println(expenses+"\n");
	                    display_Options();

	                    break;
	                case 3:
	                    System.out.println("You are about to delete all your expenses! \nConfirm again by selecting the same option...\n");
	                    int con_choice = sc.nextInt();
	                    if(con_choice==choice){
	                           expenses.clear();
	                        System.out.println(expenses+"\n");
	                        System.out.println("All your expenses are erased!\n");
	                    } else {
	                        System.out.println("Oops... try again!");
	                    }
	                    display_Options();
	                    break;
	                case 4:
	                    sortExpenses(expenses);
	                    display_Options();
	                    break;
	                case 5:
	                    searchExpenses(expenses);
	                    display_Options();
	                    break;
	                case 6:
	                    closeApp();
	                    break;
	                default:
	                    System.out.println("You have made an invalid choice!");
	                    break;
	            }
	        }
	    }

	}
	private static void closeApp() {
	    System.out.println("Closing your application... \nThank you!");
	        }
	private static void searchExpenses(ArrayList<Integer> arrayList) {
	    int leng = arrayList.size();
	    System.out.println("Enter the expense you need to search:\t");
	    //
	    Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    //Linear Search
	    for(int i=0;i<leng;i++) {
	    	if(arrayList.get(i)==input) {
	    		System.out.println("Found the expense " + input + " at " + i + " position");
	    	}
	    }
	}
	private static void sortExpenses(ArrayList<Integer> arrayList) {
	    int arrlength =  arrayList.size();
	   //Complete the method. The expenses should be sorted in ascending order.
	    
	    Collections.sort(arrayList);
	    System.out.println("Sorted expenses are: ");
	    for(Integer i: arrayList) {
	    	System.out.print(i + " ");
	    }
	    
	    System.out.println("\n");
	   
	}
	}


