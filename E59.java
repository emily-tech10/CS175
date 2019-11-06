package ch5homework;
import java.util.Scanner;

public class E59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello, please enter an angle and I will print out the nearest compass direction : ");
		double angleInput = in.nextDouble();
		
		if(angleInput > 0 && angleInput <= 22.5) 
		{
			System.out.println("NORTHEAST!");
		}
		
		else if (angleInput > 22.5 && angleInput< 67.5)
		{
			System.out.println("NORTHEAST!");
			
		}
		
		else if (angleInput >= 67.5 && angleInput <= 112.5)
		{
			System.out.println("EAST!");
			
		}
		
		else if (angleInput > 112.5 && angleInput < 157.5)
		{
			System.out.println("SOUTHEAST!");
		}
		
		else if (angleInput >= 157.5 && angleInput <= 202.5)
		{
			System.out.println("SOUTH !");
		
		}
		
		else if (angleInput >= 202.5 && angleInput < 247.5)
		{
			System.out.println("SOUTHWEST!");
		}
		
		else if (angleInput >= 247.5 && angleInput <= 292.5 )
		{
			System.out.println("WEST!");
		}
		else if (angleInput > 292.5 && angleInput < 337.5)
		{
			System.out.println("NORTHWEST!");
		}
		else if (angleInput >= 337.5 && angleInput <= 360.5)
		{
			System.out.println("NORTH! ");
		}
		
		else 
			System.out.println("Out of range, thank you for playing!");
	}
	
	

}
