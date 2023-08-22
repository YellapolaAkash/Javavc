package Arrays;

public class Swap_of_elements {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8},i=0;
		int b[]=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			
			if(x%2==0)
			{
				
				b[i]=a[a.length-2-x];
			}
			
			else
			{
				b[i]=a[x];
			}
			i++;
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.print(b[x]);
		}

	}

}
