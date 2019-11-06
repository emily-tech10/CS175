package ch5homework;
import java.util.Scanner;
public class E53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer of your choosing and I will print the number of digits it has : ");
		long intInput  = in.nextLong();
		int digits = 0;
		
		if (intInput < 0)
			intInput *= 1;
		if (intInput < 10)
			digits = 1;
		else if (intInput >= 10  || intInput < 100 )
			digits = 2;
		else if (intInput >= 100 || intInput < 1000)
			digits = 3;
		else if (intInput >= 1000 || intInput < 10000)
			digits = 4;
		else if (intInput >= 10000 || intInput < 100000)
			digits = 5;
		else if (intInput >= 100000 || intInput < 1000000)
			digits = 6;
		else if( intInput >= 1000000 || intInput < 10000000)
			digits = 7;
		else if (intInput >= 10000000 || intInput < 100000000)
			digits = 8;
		else if (intInput >= 100000000 || intInput < 1000000000)
			digits = 9;
		else if (intInput >= 1000000000 || intInput < 10000000000l)
			digits = 10;
		else
			System.out.println(" Wow! The number you have entered is greater than ten billion .");
		
		System.out.println("The number of digits in the number you have entered is: " + digits );
		
		
		
		
		
			
		
		
	
		
			
			
			
				

		
	
		

	}//class

}//main
