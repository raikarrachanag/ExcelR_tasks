package array;

public class RemoverepeatedfromArray {
	public static void main(String[] args) {
		
		int a[]= {1,1,2,2,3,3,4,4,5,5,6,6};
		int i,j,k;
		int size=a.length-1;
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;)
			{
				if(a[i]==a[j])
				{
					for(k=j;k<size;k++)
					{
						a[k]=a[k+1];
					}
					
					size--;
				}
				
				else
				{
					j++;
				}
			}
		}
		
		System.out.println("After removing repeated elements array is : ");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}

}
