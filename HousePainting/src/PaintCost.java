import java.util.Scanner;
public class PaintCost {

	public static void main(String[] args) {
		/*
		 * This program will calculate the cost to paint a house  
		 */		
		Scanner in = new Scanner (System.in); 
		
		System.out.print("Please enter the length of the house in feet : ");
		double houseLengthFeet = in.nextDouble(); 
		
		
		System.out.print("Please enter the width of the house in feet : ");
		double houseWidthFeet = in.nextDouble(); 
		
		
		System.out.print("Please enter the height of the house in feet : ");
		double houseHeightFeet = in.nextDouble();
		
				
		System.out.print("Please enter the number of windows in the house : ");
		int numberOfWindows = in.nextInt();
		
		
		System.out.print("Please enter the length of the window in feet : ");
		double windowLengthFeet = in.nextDouble();
		
		
		System.out.print("Please enter the width of the window in feet : ");
		double windowWidthFeet = in.nextDouble();

		
		System.out.print("Please enter the number of doors in the house : ");
		int numberOfDoors = in.nextInt();
		
		System.out.print("Please enter the length of the door : ");
		double doorLengthFeet = in.nextDouble();
		
		
		System.out.print("Please enter the width of the door in feet ");
		double doorWidthFeet = in.nextDouble();
		
		double sqFTToPaint = 2756;
		
		System.out.println("Your total sq ft is " + sqFTToPaint);
		
		double costPerSqFt = 5.00;
		
		System.out.println("Your total cost to paint is " + sqFTToPaint*costPerSqFt);
		
		
		
		
		
		
		
		
		
		
		
				
				
		
				
				
		
		
		
	
		
		
	}

}
