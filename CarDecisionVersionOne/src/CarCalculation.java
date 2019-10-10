    import java.util.Scanner;

	public class CarCalculation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Please enter the cost of the regular car : ");
	
	double costOfCar = in.nextDouble();
	
	System.out.println("Please enter the miles per gallon of the regular car : ");
	
	double milesPerGallon = in.nextDouble();
	
	System.out.println("Please enter the cost of the hybrid car : ");
	
	double costOfHybridCar = in.nextDouble();
	
	System.out.println("Please enter the miles per gallon of hybrid car : ");
	
	double milesPerGallonHybrid = in.nextDouble();
	
	System.out.println("Please enter the miles traveled in a year :  "); 
	
	double milesTraveled = in.nextDouble();
	
	System.out.println("Please enter the cost per gallon of gas : ");
	
	double costOfGas =  in.nextDouble();
	
	double regularOneYear = (milesTraveled/milesPerGallon)*costOfGas + costOfCar;
			
	double hybridOneYear =  (milesTraveled/milesPerGallonHybrid)*costOfGas + costOfHybridCar;
	
	double regularTwoYears = regularOneYear + 1875; 
	
	double hybridTwoYears  = hybridOneYear + 1250;
	
	double regularThreeYears = regularTwoYears + 1875;
	
	double hybridThreeYears = hybridTwoYears + 1250; 
	
	double regularFourYears = regularThreeYears + 1875;
			
	double hybridFourYears = hybridThreeYears + 1250;
	
	double regularFiveYears = regularFourYears + 1875;
	
	double hybridFiveYears = hybridFourYears + 1250; 
			
	System.out.println("Cost to own after one year for regular car : " + regularOneYear + " for hybrid car :  " + hybridOneYear);
	
	System.out.println("Cost to own after two years for regular car : " + regularTwoYears + " for hybrid car : " + hybridTwoYears);
	
	System.out.println("Cost to own after three years for regular car : " + regularThreeYears + " for hybrid car : " + hybridThreeYears);
	
	System.out.println("Cost to own after four years for regular car : " + regularFourYears + " for hybrid car : " + hybridFourYears);
	
	System.out.println("Cost to own after five years for regular car : " + regularFiveYears + " for hybrid car : " + hybridFiveYears);
	
	double a = 37375.0;
	
	double b = 37250.0 ; 
	
	if (a>b) {System.out.println("The hybrid car pays back after 5 years");
			
	}

} } 
