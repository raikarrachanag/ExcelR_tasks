package array;

import java.util.Scanner;

public class separate_even_odd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array :");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements of an array :");
		
		for(int i = 0; i<size; i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]>0)
			{
				if(a[i]%2==0)
				{
					
					System.out.println("Even Numbers");
					System.out.println(a[i]);

				}
			
				else
				{

					System.out.println("Odd Numbers");
					System.out.println(a[i]);
				}
			}
		}
		
	}

}


