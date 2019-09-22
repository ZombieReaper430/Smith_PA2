import java.util.Scanner;

public class Smith_p2 {

	public static void main(String[] args) {
		
		double BMI = ask();
		System.out.println("Your BMI score is " + Math.round(BMI));
		
		rankBMI(BMI);
	}

	public static double ask()
	  {
	    System.out.println("Would you like to use Method 1 or Method 2?");
	    System.out.println("Method 1 uses Pounds and Inches to find BMI");
	    System.out.println("Method 2 uses Kilograms and Meters to find BMI");
	    
	    int choice = 0;
	    double num = 0;
	    Scanner scan = new Scanner(System.in);
	    
	    while (choice != 1 && choice != 2)
	    {
	    	System.out.println("Please input the number of the method you would like to use");	
	    	choice = scan.nextInt();
	      
	    	if (choice == 1)
	    	{
	    		num = americanBMI();
	    	}
	    	
	    	if (choice == 2)
	    	{
	    		num = metricBMI();
	    	}
	    	
	    }
	    
	    return num; //Return value of input
	  }
	
	public static double americanBMI()
	{
		Scanner scan = new Scanner(System.in);
		double weight, height, BMI;
		
		System.out.println("What is you weight in pounds?");
		weight = scan.nextInt();
		
		System.out.println("What is yourt height in inches");
		height = scan.nextInt();
		
		BMI = 703 * weight / Math.pow(height, 2);
		
		return BMI;
	}
	
	public static double metricBMI()
	{
		Scanner scan = new Scanner(System.in);
		double weight, height, BMI;
		
		System.out.println("What is you weight in kilograms?");
		weight = scan.nextInt();
		
		System.out.println("What is yourt height in meters");
		height = scan.nextInt();
		
		BMI = weight / Math.pow(height, 2);
		
		return BMI;
	}
	
	public static void rankBMI(double BMI) 
	{
		
		if (BMI < 18.5)
    	{
			System.out.println("You are Under Weight");
    	}
    	
    	if (18.5 <= BMI && BMI < 25)
    	{
    		System.out.println("You are Normal Weight");
    	}
    	
		if (25 <= BMI && BMI < 30)
		{
			System.out.println("You are Over Weight");
		}
	
		if (30 <= BMI)
		{
			System.out.println("You are Obese");
		}
		
	}
	
}