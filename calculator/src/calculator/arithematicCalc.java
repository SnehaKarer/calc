package calculator;
import java.util.*;


public class arithematicCalc {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int fnum,snum,ans;
		char sign; 
		 
		
		System.out.print("Please Enter your first digit: "); 
		
		fnum=input.nextInt();
		
		System.out.print("Enter the second digit: ");
		snum=input.nextInt();
		
		
		System.out.print("Enter the mathematical operator to be used: ");
		sign=input.next().charAt(0);
		if (sign == '+' ) {
			ans=fnum + snum;
			System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
		}
		else if(sign == '-')
		{
			ans=fnum-snum;
			System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
		}
		else if(sign == '/'){
				ans=fnum/snum;
				System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
	    }
		else if(sign == '*'){
					ans=fnum*snum;
					System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
		}
		else
			
		System.out.println("input incorrect");
		
		
			
	}


		
	}
	
	

