import java.util.Scanner;
public class GpaCalculatorV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		double numericGrade = 0.0;
		double gpa = 0.0;
		double gradePoints = 0.0;
		double totalNumberGrade = 0.0;
		int totalHours = 0;
		String courseInfo = null;
		
		
		System.out.print("Please enter your course info separated by commas(title, credit hours, a letter grade(followed by + or - if applicable), I will calculate your overall GPA, or Q to quit : ");		

		while(scan.hasNext()) {

			courseInfo = scan.next();
			if(courseInfo.equals("Q")) {
				break;
			}
			
			
			String [] information = courseInfo.split(",");
			String courseInput = information[0];
			int hoursInput = Integer.parseInt(information[1]);
			String letterGrade = information[2];


			if(letterGrade.equals("A") || letterGrade.equals("A+")) {
				numericGrade = 4.0;
			}
			else if(letterGrade.equals("A-")) {
				numericGrade = 3.7;
			}
			else if(letterGrade.equals("B+")) {
				numericGrade = 3.3;
			}
			else if(letterGrade.equals("B")) {
				numericGrade = 3.0;
			}
			else if(letterGrade.equals("B-")) {
				numericGrade = 2.7;
			}
			else if(letterGrade.equals("C+")) {
				numericGrade = 2.3;
			}
			else if(letterGrade.equals("C")) {
				numericGrade = 2.0;
			}
			else if(letterGrade.equals("C-")) {
				numericGrade = 1.7;
			}
			else if(letterGrade.equals("D+")) {
				numericGrade = 1.3;
			}
			else if(letterGrade.equals("D")) {
				numericGrade = 1.0;
			}
			else if(letterGrade.equals("D-")) {
				numericGrade = 0.7;
			}
			else if(letterGrade.equals("F") || letterGrade.equals("WF"))  {
				numericGrade = 0.0;
			}
			else if(letterGrade.equals("P") || letterGrade.equals("NP") || letterGrade.equals("I")){
				hoursInput = 0;
			}
			else {
				System.out.println("Program terminated ");
			}
			gradePoints += (numericGrade * hoursInput);
			totalHours += hoursInput;
			totalNumberGrade += numericGrade;
			gpa = gradePoints/totalHours;
			System.out.println("Course: " + information + " | Credit Hours: " + hoursInput + " | Letter Grade: " + letterGrade + " | "
					+ "Grade Points: " + totalNumberGrade);
			
			System.out.print("Enter course info separated by commas with no spaces (title, credit hours, letter grade "
					+ "(followed by + or - if applicable)) or Q to quit the program: ");
		}
	

		System.out.print("Your gpa is: " + gpa);
		
		

	}

}
