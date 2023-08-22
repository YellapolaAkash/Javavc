package ArrayChapter1;

public class Square_cube {
//square the even elements and cube the odd elements
	public static void main(String[] args)
	{
		int a[]=new int[] {4,7,9,11,2,6,5,3,1,8};
		int b[]=new int[a.length];

		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				b[x]=a[x]*a[x];
				
			}
			else
			{
				b[x]=a[x]*a[x]*a[x];
			}
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(b[x]);
		}
	}

}
