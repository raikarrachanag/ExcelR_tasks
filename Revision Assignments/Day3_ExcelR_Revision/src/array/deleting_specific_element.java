package array;

import java.util.Scanner;

public class deleting_specific_element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, pos=0, flag=0, del;
		
		int a[] = {1,2,3,4,5,6};
		int t[] = new int[a.length-1];
		
		System.out.println("Enter the element to delete :");
		del = sc.nextInt();
		
		for(i=0; i<a.length; i++)
		{
			if(a[i]==del)
			{
				pos=i;
			}			
		}
		
		for(i=0; i<pos; i++)
		{
			t[i]=a[i];
		}
		
		for(i=pos; i<=t.length-1; i++)
		{
			t[i]=a[i+1];
		}
		
		System.out.println("Array after deleting ");
		
		for(i=0; i<t.length; i++)
		{
			System.out.println(t[i]);
		}
		
		

	}

}

