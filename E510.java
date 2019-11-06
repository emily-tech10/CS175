package ch5homework;
import java.util.Scanner;
public class E510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double paycheckAmount; 
		double hoursThreshold = 40;
		final double extraPercentage = 1.50;
		
		System.out.println("Please enter your name : ");
		String name = in.next();
		
		System.out.println("Please enter your hourly wage : ");
		double hourlyWage = in.nextDouble();
		
		System.out.println("Please enter how many hours you have worked in the past week: ");
		double hoursWorked = in.nextDouble();
		
		if (hoursWorked > hoursThreshold)
			paycheckAmount = (extraPercentage * hourlyWage) * hoursWorked ;
		
		else 
			paycheckAmount = hourlyWage * hoursWorked;
		
		System.out.println("Your pay for this week is : " + paycheckAmount);
		
		
		
			
		
			
		
	}

}
