package calc;
import java.util.Scanner;

public class calcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double ans;
		char op;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		num1 = reader.nextDouble();
		num2 = reader.nextDouble();
		System.out.println("/n Enter an operator (+ , - , * ,/ ): ");
		op = reader.next() .charAt(0);
		switch(op) {
			case '+': ans = num1 + num2;
				break;
			case '-': ans = num1 - num2;
				break;
			case '*': ans = num1 * num2;
				break;
			case '/': ans = num1 / num2;
				break;
	    default: System.out.print("Wrong entry");
			return;
	
		}  
		System.out.println("\nThe result is given as follows:\n");
		System.out.println(num1 + " " + op + " " + num2 + "="  + ans);
	}

}

