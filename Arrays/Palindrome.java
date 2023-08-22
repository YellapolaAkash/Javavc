package ArrayChapter1;

public class Palindrome {

	public static void main(String[] args) 
	{
		int a[]=new int[] {11,21,33,412,527,606},rem=0,y,rev=0;
		for(int x=0;x<a.length;x++)
		{
			rev=0;
			y=a[x];
			for(;y>0;y/=10)
			{
				rem=y%10;
				rev=rev*10+rem;
			}
		     y=a[x];
			if(rev==y)
			{
				System.out.println(y);
			}
			
		}
	}

}
