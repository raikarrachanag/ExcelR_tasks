package array;

import java.util.Scanner;

public class Insert_element_to_an_array {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a[] = {1,2,3,4,5,6};
		int t[] = new int[a.length+1];

		System.out.println("enter the element you wanted add ");
		int ele= sc.nextInt();
		
		System.out.println("enter the Index where you wanted add the element "+ele);
		int place= sc.nextInt();
		
		place = place - 1;
		
		for(int i=0; i<a.length+1; i++)
		{
			if(i<place)
			{
				t[i]=a[i];
			}
			
			if(i>place)
			{
				t[i]=a[i-1];
			}
			
			if(i==place)
			{
				t[i]=ele;
			}
		}
		
		System.out.println("after insertion array is:");
		
		for(int i=0; i<t.length; i++)
		{
			System.out.println(t[i]);
		}

	}

}