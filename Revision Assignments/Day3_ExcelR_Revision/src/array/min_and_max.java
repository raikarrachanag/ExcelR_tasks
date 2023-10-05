package array;

import java.util.Scanner;

public class min_and_max {

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
		
		int min=a[0];
		int max=a[0];
		
		for(int i = 0; i<a.length; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println("Min number is : "+min);
		System.out.println("Max number is : "+max);
	}

}





