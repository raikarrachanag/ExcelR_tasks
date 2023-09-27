package looping_programs;

import java.util.Scanner;

public class Table_printing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.println("enter num");
		int num = sc.nextInt();
		
		for(i=1; i<=10; i++)
		{
			int t = num * i;
			System.out.println(num + " X " +i+ " = " +t);
		}
		
		
	}

}