package evenodd;

import java.util.Scanner;

public class evenoddprog {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		n=sc.nextInt();
		if(n%5==0)
		{
			System.out.println("the entered number is divisible by 5");
		}
		else {
			System.out.println("the entered number isn't divisible by 5 ");
		}
		
		
	}
	

}
