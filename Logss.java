import java.util.Scanner;

public class Logss {

	public static void main(String args[]) {
   	Scanner num = new Scanner(System.in);
   	System.out.println("Please enter a number");
	double a = num.nextDouble();
	System.out.println("Please enter a base number");
	double b = num.nextDouble();
	double c=0;
	while (a>1)
	{
		a=a/b; 
		c++;
	}
	System.out.println("the answer is approximately"+ c);
	
	
	}
}