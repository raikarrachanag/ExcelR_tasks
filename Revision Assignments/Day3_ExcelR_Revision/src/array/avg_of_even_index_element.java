package array;

public class avg_of_even_index_element {

	public static void main(String[] args) {
		
		int sum=0;
		int a[] = {1,2,3,4,5,6};
		
		for(int i=0; i<a.length; i++)
		{
			if(i%2==0)
			{
				sum+=a[i];
			}
		}
		
		System.out.println("Sum is : "+sum);


	}

}

























