import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args) 
	{
		double operand1 = 0;
		double operand2 = 0;
		double result = 0;
		byte choice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculator");
		System.out.println("Press 1 to ADD");
		System.out.println("press 2 to SUBTRACT");
		System.out.println("press 3 to MULTIPLY");
		System.out.println("press 4 to DIVIDE");
		System.out.println("press 5 for MODULO");
		choice = scan.nextByte();
		
		System.out.println("Enter first value: ");
		operand1 = scan.nextDouble();
		
		System.out.println("Enter second value: ");
		operand2 = scan.nextDouble();
		
		if(choice == 1)
		{
			result = operand1 + operand2;
			System.out.println("The sum is: " + result);
		}
		else if (choice == 2)
		{
			result = operand1 - operand2;
			System.out.println("The difference is: " + result);
		}
		else if (choice == 3)
		{
			result = operand1 * operand2;
			System.out.println("The product is: " + result);
		}
		else if (choice == 4)
		{
			result = operand1 / operand2;
			System.out.println("The quotient is: " + result);
		}
		else if (choice == 5)
		{
			result = operand1 % operand2;
			System.out.println("The modulo is: " + result);
		}
		else
			System.out.println("sorry invalid choice");
	}

}
