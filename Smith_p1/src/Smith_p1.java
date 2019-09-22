import java.util.Scanner;

public class Smith_p1 {
	
		public static void main(String[] args) {
			int newNumber, oldNumber;
			
			newNumber = getnum(); //Calls getnum()
			System.out.println("Your new number is " + newNumber);
			
			oldNumber = decrypt(newNumber);
			System.out.println("Your original number was " + oldNumber);
		}
		
		public static int getnum()
		  {
		    int number = 0, stringSize = 0;
		    String input; //To hold the value of input number in a String
		     
		    Scanner scan = new Scanner(System.in);
		    
		    // ensures 4 digits
		    while (stringSize != 4)
		    {
		      System.out.println("Please enter a four digit number to encrypt:"); //
		      input = scan.nextLine();
		      stringSize = input.length(); //Checks String for digit length
		      
		      if (stringSize == 4)
		      {
		    	  number = Integer.parseInt(input);
		      }
		    }
		    
		    number = encrypt(number);
		    
		    return number; //Return value of input
		    }
		
		public static int encrypt(int num) 
		  {
		    int a, b, c, d; // a, b, c, d and the first, second, third, and fourth digits
		     
		    //Gets each digit
		    a = num / 1000;	
		    b = num / 100 % 10;
		    c = num / 10 % 10;
		    d = num % 10;
		    
		    //encrypts each digit
		    a = (a + 7) % 10;
		    b = (b + 7) % 10;
		    c = (c + 7) % 10;
		    d = (d + 7) % 10;
		     
		    return (c * 1000 + d * 100 + a * 10 + b ); //Returns encrypted four digit value

		  }
		
		public static int decrypt(int num) 
		  {
		    int a, b, c, d; // a, b, c, d and the first, second, third, and fourth digits
		     
		    //Gets each digit
		    a = num / 1000;
		    b = num / 100 % 10;
		    c = num / 10 % 10;
		    d = num % 10;
		    
		    //decrypts each digit
		    a = (a + 3) % 10;
		    b = (b + 3) % 10;
		    c = (c + 3) % 10;
		    d = (d + 3) % 10;
		     
		    return (c * 1000 + d * 100 + a * 10 + b ); //Returns decrypted four digit value

		  }
		
		
	}

