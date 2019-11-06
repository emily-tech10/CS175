package ch5homework;
import java.util.Scanner;
public class E511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String water = "";
		System.out.println("Please enter a temperature and I will tell you what state the water is");
		double degrees = in.nextDouble();
		
		System.out.println("Enter a C for celsius or F for fahrenheit");
		String temperatureType = in.next();
		
		if(degrees >= 100)
			water = "gaseous";
		
		else if ( degrees  >  0)
			water = "liquid";
			
		else if (degrees <= 0)
			water = "solid";
		
		System.out.println("The state of your water is " + water);
		
		
		
		
		
		
		
		

	}

}
