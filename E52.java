package ch5homework;
import java.util.Scanner;
public class E52 {

	public static void main(String[] args) { {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a decimal of your choosing");
		float n1 = in.nextFloat();
		
		if (n1 > 0 )
		{
			if(n1 < 1)
				System.out.println("The decimal you entered is positive and small");
			
			else if (n1 > 1000000)
				System.out.println ("The decimal you entered is positive and large");
			
			else 
				System.out.println("The decimal you entered is a positive number");}
			
		else if (n1 < 0)
			{
				if(Math.abs(n1) < 1)
					System.out.println("The decimal you entered is negative and small");
				
				else if (Math.abs(n1) > 1000000)
					System.out.println("The decimal you have entered is a negative and large");
				
				else 
					System.out.println("The decimal you have entered is negative");
				
			}
				
		else 
			System.out.println("The decimal you have entered is zero");
		}	
	}//class

} // main
