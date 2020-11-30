import java.util.Scanner;

public class Division {
	
	public static void main(String[]args) {
		System.out.println("Please enter two numbers");
	  Scanner scanner = new Scanner(System.in);
	  double c = scanner.nextDouble();
	  double d = scanner.nextDouble();
	  double Add=(c+d), Subtract=(c-d),Multiply=(c*d),Divide=(c/d);
	System.out.println("Would you like to add,subtract,multiply or divide?");
	 Scanner scanner3 = new Scanner(System.in);
	String b= scanner3.next();
	
	switch (b)
	{	
	       case "add":
	    	   System.out.println("the answer is"+""+Add);
			break;
			
			case "subtract":
			
			
				System.out.println("the answer is"+""+Subtract);
	            break;
	        
	
			case "multiply":
			
				System.out.println("the answer is"+""+Multiply);
		        break;
		     
		case "divide":
		
			System.out.println("the answer is"+""+Divide);
	        break;
		
	        default:
	         System.out.println("There is a default");
	        break;
	        
		
	  }
	}
}