import java.util.Scanner;
public class GpaCalculatorV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your letter grade or Q to quit the program : ");
		String letterGrade = in.next();
		double numericGrade = 0;

		
		if(letterGrade.equals("A+")||letterGrade.equals("A"))
			numericGrade = 4.0;
		else if(letterGrade.equals("3.7"))
			numericGrade = 3.7;
		else if (letterGrade.equals("B+"))
			numericGrade = 3.3;
		else if (letterGrade.equals("B"))
			numericGrade = 3.0;
		else if (letterGrade.equals("B-"))
			numericGrade = 2.7;
		else if (letterGrade.equals("C+"))
			numericGrade = 2.3;
		else if (letterGrade.equals("C"))
			numericGrade = 2.0;
		else if (letterGrade.equals("C-"))
			numericGrade = 1.7;
		else if (letterGrade.equals("D+"))
			numericGrade=1.3; 
		else if (letterGrade.equals("D"))
			numericGrade = 1.0;
		else if (letterGrade.equals ("D-"))
			numericGrade = 0.7;
		else if (letterGrade.equals("F"))
			numericGrade = 0.0;
		else
			System.out.println("Program terminated.");
		
		System.out.println("The numeric value is " + numericGrade);
		
		
			
			
		
		
		
	}

}
