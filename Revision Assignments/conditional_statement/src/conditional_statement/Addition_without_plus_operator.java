package conditional_statement;


import java.util.Scanner;

public class Addition_without_plus_operator {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number to check :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd number to check :");
		int num2 = sc.nextInt();
		
		if(num1 > num2)
		{
			for (int i = 1; i <= num2; i++)
			{
				num1++;
			}
			System.out.println("Sum is :" +num1);
		}
		
		else if(num1 < num2)
		{
			for (int i = 1; i <= num2; i++)
			{
				num1++;
			}
			System.out.println("Sum is :" +num1);
		}
		
		else
		{
			for (int i = 1; i <= num2; i++)
			{
				num1++;
			}
			System.out.println("Sum is :" +num1);
		}

	}

}