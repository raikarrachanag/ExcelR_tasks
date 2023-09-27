package special_programs;

import java.util.Scanner;

public class Perfect_nos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int r, sum=0, i=1;
		
		while(i<=n/2)
		{
			if(n % i == 0)
			{
				sum = sum + i;
			}
			i++;
		}
		
		if(sum == n)
		{
			System.out.println(n+ " is Perfect number");
		}
		
		else
		{
			System.out.println(n+ " is Not-Perfect number");
		}

	}

}