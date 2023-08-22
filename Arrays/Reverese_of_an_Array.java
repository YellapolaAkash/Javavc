package Arrays;

public class Reverese_of_an_Array {

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,7,9,10,2,3};
		int b[]=new int[9],j=0;
		for(int x=a.length-1;x>=0;x--)
		{
			b[j]=a[x];
			j++;
		}
		for(int y=0;y<b.length;y++)
		{
			System.out.println(b[y]);
		}
	}


}
