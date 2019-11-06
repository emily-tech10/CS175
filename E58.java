package ch5homework;

import java.util.Scanner;

public class E58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println( "Please enter 4 numbers ");
		int n1 = in.nextInt(); 
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int n4 = in.nextInt();
		
		if ((n1 == n2 && n3 == n4 ) || (n1 == n3 && n2 == n4) || (n1 == n4 && n2 ==n3 ))
			System.out.println("There are two pairs in the four numbers you have entered");
		
		else 
			System.out.println("There are not two pairs in the four numbers you have entered");
				
				
		
		

	}

}
