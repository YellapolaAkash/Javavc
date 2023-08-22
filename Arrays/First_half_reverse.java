package Arrays;

public class First_half_reverse {

	public static void main(String[] args)
	{
		int a[]=new int[] {10,20,30,40,50,60,70,80};
		System.out.println(a.length);
		for(int x=((a.length-1)/2);x>=0;x--)
		{
			System.out.println(a[x]);
		}
		for(int x=((a.length-1)/2)+1;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	}

}
