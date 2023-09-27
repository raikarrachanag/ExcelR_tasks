package arrays;

public class Adding_elements_of_arrays {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5};
		
		int sum=0;
		
		for(int i=0; i<5; i++)
		{
			sum = sum + a[i]; 
		}
		System.out.println("The sum is : "+sum);
	}

}